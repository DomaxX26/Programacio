import java.io.*;
import java.util.*;

public class Cartelera {
    private Scanner scan = new Scanner(System.in);
    private String [] Menu = new String[9];
    private String [] Genere = new String[]{"Acció", "Aventures", "Animació", "Comèdia", "Documental", "Drama", "Terror", "Musical", "Romàntica" , "Ciència Ficció"};
    private Serie serie = new Serie();
    boolean comprovacioPeli = false;
    boolean comprovacioSerie = false;
    ArrayList pelisArrays;
    ArrayList seriesArray;


    public Cartelera(){
        pelisArrays =  new ArrayList();
        seriesArray =  new ArrayList();
        inicialitzarMenu();
        carregarCartelera();
    }

    public void inicialitzarMenu(){
        Menu [0] = "[1] Mostrar Pel·licules";
        Menu [1] = "[2] Mostrar Series";
        Menu [2] = "[3] Afegir Pel·licula";
        Menu [3] = "[4] Eliminar Pel·licula";
        Menu [4] = "[5] Editar Pel·licula";
        Menu [5] = "[6] Afegir Serie";
        Menu [6] = "[7] Eliminar Serie";
        Menu [7] = "[8] Editar Serie";
        Menu [8] = "[9] Tancar Aplicació";
    }
    public void mostrarPrograma() {
        System.out.print("--------MENÚ CARTELERA--------\n");
        for (String m: Menu) {
            System.out.print(m + "\n");
        }
    }

    public void menuCartelera(int menuCarte){
        Pelis p = new Pelis();
        Serie s = new Serie();
        switch (menuCarte){
            case 1:
                System.out.print("\n");
                System.out.println("--------PEL·LICULES---------");
                mostrarPelis();
                carregarPantalla();
                break;
            case 2:
                System.out.println("--------SERIES---------");
                mostrarSeries();
                System.out.print("\n");
                carregarPantalla();
                break;
            case 3:
                System.out.println("--------NOVES PEL·LICULES--------");
                novaPeli(donarAltaPeli());
                carregarPantalla();
                break;
            case 4:
                System.out.println("--------ELIMINAR PEL·LICULES--------");
                System.out.print("Titol de la pel·licula a esborrar: ");
                p.titol = scan.nextLine();

                System.out.print("Any de la pel·licula a esborrar: ");
                p.any = scan.nextInt();
                baixaPeli(p.titol, p.any);
                comprovacioBaixaPeli();
                carregarPantalla();
                break;
            case 5:
                System.out.println("--------MODIFICAR PEL·LICULES--------");
                System.out.print("Titol de la pel·licula a editar: ");
                p.titol = scan.nextLine();

                System.out.println("Any de la pel·licula a editar: ");
                p.any = scan.nextInt();
                editarPeli(p.titol, p.any);
                carregarPantalla();
                break;
            case 6:
                System.out.println("--------NOVES SERIES--------");
                novaSerie(donarAltaSerie());
                carregarPantalla();
                break;
            case 7:
                System.out.println("--------ELIMINAR SERIES--------");
                System.out.print("Titol de la serie a esborrar: ");
                s.titol = scan.nextLine();

                System.out.print("Any de la serie a esborrar: ");
                s.any = scan.nextInt();
                baixaSerie(s.titol, s.any);
                comprovacioBaixaSerie();
                carregarPantalla();
                break;
            case 8:
                System.out.println("--------MODIFICAR SERIES--------");
                System.out.print("Titol de la serie a editar: ");
                s.titol = scan.nextLine();

                System.out.print("Any de la serie a editar: ");
                s.any = scan.nextInt();
                editarSerie(s.titol, s.any);
                carregarPantalla();
                break;
            case 9:
                System.out.println("Tancant la Aplicació...");
                break;

        }
    }


    public void carregarPantalla(){
        int menu = -1;
        do {
            inicialitzarMenu();
            mostrarPrograma();
            System.out.print("Introdueix un valor: ");
            if (scan.hasNextInt()){
                menu = scan.nextInt();
                if (menu >= 1 || menu <= 9){
                    menuCartelera(menu);
                }
                else{
                    System.out.println("Opció elegida incorrecta, torna introduïr un valor");
                }
            }
            else {
                scan.next();
                System.out.print("Valor introduït incorrecte");
            }
        }
        while (menu < 1 || menu > 9);
    }
    public void mostrarPelis(){
        ArrayList<Pelis> llista = getPelis();
        Iterator<Pelis> iter = llista.iterator();
        while (iter.hasNext()){
            Pelis p = (Pelis) iter.next();
            System.out.println(p.toString());
        }
    }
    public void mostrarGenere(){
        System.out.println("--------Tipos de Genere-------");
        for (int i = 0; i < Genere.length; i++) {
            System.out.println("- " + Genere[i]);
        }
    }
    public Pelis donarAltaPeli(){
        Pelis pelis = new Pelis();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Títol: ");
        pelis.titol = scanner.nextLine();

        System.out.print("Any: ");
        pelis.any = scanner.nextInt();
        scanner.nextLine();

        System.out.print("País de Producció: ");
        pelis.pais = scanner.nextLine();

        mostrarGenere();
        System.out.print("Genere: ");
        pelis.genere = scanner.nextLine();

        System.out.print("Resum de la pel·licula: ");
        pelis.resum = scanner.nextLine();

        System.out.print("Director: ");
        pelis.director = scanner.nextLine();

        System.out.print("Actor principal: ");
        pelis.actors = scanner.nextLine();

        getPelis();
        return pelis;
    }
    public void novaPeli(Pelis pelis){
        this.pelisArrays.add(pelis);
    }

    public boolean baixaPeli(String titol, int any){
        Iterator<Pelis> iter;
        iter = this.pelisArrays.iterator();
        while(iter.hasNext()){
            Pelis p = (Pelis) iter.next();
            if (p.titol.equals(titol) && p.any == any){
                this.pelisArrays.remove(p);
                return comprovacioPeli = true;
            }
        }
        return comprovacioPeli;
    }

    public void comprovacioBaixaPeli(){
        if(comprovacioPeli == true){
            System.out.println("LA PEL·LICULA S'HA ELIMINAT CORRECTAMENT");
        }
        else {
            System.out.println("LA PEL·LICULA NO S'HA TROBAT");
        }
        comprovacioPeli = false;
    }

    public ArrayList<Pelis> getPelis(){
        return this.pelisArrays;
    }

    public void editarPeli(String titol, int any){
        int cont = -1;
        Iterator<Pelis> iter;
        iter = this.pelisArrays.iterator();
        while(iter.hasNext()){
            cont++;
            Pelis p = (Pelis) iter.next();
            if (p.titol.equals(titol) && p.any == any){
                this.pelisArrays.set(cont,donarAltaPeli());
                return;
            }
        }
    }

    public void mostrarSeries(){
        ArrayList<Serie> llista = getSeries();
        Iterator<Serie> iter = llista.iterator();
        while (iter.hasNext()){
            Serie s = (Serie) iter.next();
            System.out.println(s.toString());
        }
    }

    public Serie donarAltaSerie(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Títol: ");
        serie.titol = scanner.nextLine();

        System.out.print("Any: ");
        serie.any = scanner.nextInt();
        scanner.nextLine();

        System.out.print("País de Producció: ");
        serie.pais = scanner.nextLine();

        mostrarGenere();
        System.out.print("Genere: ");
        serie.genere = scanner.nextLine();

        System.out.print("Resum de la serie: ");
        serie.resum = scanner.nextLine();

        System.out.print("Director: ");
        serie.director = scanner.nextLine();

        System.out.print("Actor Principal: ");
        serie.actors = scanner.nextLine();

        System.out.print("Temporades de la serie: ");
        serie.temporades = scanner.nextInt();

        System.out.print("Capitols de la Temporada: ");
        serie.capitolTemporada = scanner.nextInt();

        infoTemporades(serie.temporades, serie.capitolTemporada);

        getSeries();
        return serie;
    }

    public void infoTemporades(int temporades, int capitols){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < temporades; i++) {
            System.out.println("--------TEMPORADA " + (i+1) + "--------");
            System.out.print("Any de la Temporada "+(i+1)+": ");
            serie.anyTemporada = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < capitols; j++) {
                System.out.print("Titol del Capitol "+(j+1)+": ");
                serie.titolCapitol = scanner.nextLine();

                System.out.print("Sinopsis: ");
                serie.sinopsis = scanner.nextLine();
            }
        }
    }
    public void novaSerie(Serie series){
        this.pelisArrays.add(series);
    }

    public ArrayList<Serie> getSeries(){
        return this.seriesArray;
    }

    public boolean baixaSerie(String titol, int any){
        Iterator<Serie> iter;
        iter = this.seriesArray.iterator();
        while(iter.hasNext()){
            Serie s = (Serie) iter.next();
            if (s.titol.equals(titol) && s.any == any){
                this.seriesArray.remove(s);
                return comprovacioSerie = true;
            }
        }
        return comprovacioSerie;
    }


    public void comprovacioBaixaSerie(){
        if(comprovacioSerie == true){
            System.out.println("LA SERIE S'HA ELIMINAT CORRECTAMENT");
        }
        else {
            System.out.println("LA SERIE NO S'HA TROBAT");
        }
        comprovacioSerie = false;
    }

    public void editarSerie(String titol, int any){
        int cont = -1;
        Iterator<Serie> iter;
        iter = this.seriesArray.iterator();
        while(iter.hasNext()){
            cont++;
            Serie s = (Serie) iter.next();
            if (s.titol.equals(titol) && s.any == any){
                this.seriesArray.set(cont,donarAltaSerie());
                return;
            }
        }
    }
    // /home/jpons/IdeaProjects/TendaElectrodomestics/src/Clients.txt
    public void carregarCartelera(){
        try {
            File fPelis = new File("C:/Users/DomaxX26/IdeaProjects/Netflix/src/Pelis.txt");
            Scanner scanPelis = new Scanner(fPelis);
            while(scanPelis.hasNextLine()){
                String srtLine = scanPelis.nextLine();
                Pelis pelis = new Pelis(srtLine);
                pelisArrays.add(pelis);
            }
            scanPelis.close();

            File fSeries = new File("C:/Users/DomaxX26/IdeaProjects/Netflix/src/Series.txt");
            Scanner scanSeries = new Scanner(fSeries);
            while(scanSeries.hasNextLine()){
                String srtLine = scanSeries.nextLine();
                Serie series = new Serie(srtLine);
                seriesArray.add(series);
            }
            scanSeries.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Hi ha un error");
        }
    }

}
