
import java.util.Scanner;

public class cTauler {
    //Declaració de constants
    private final static int AMPLE = 8;
    private final static int ALT = 8;
    private String[][] vaixells;
    private String [][] dispars;
    private Scanner scan = new Scanner(System.in);
    private cPortavions p;
    private cCuirassat c;
    private cFragata f;
   private cDestructor d;
    private cSubmari s;
    public int fila;
    public int columna;
    public boolean direccio;

    //Constructor de la classe
    public cTauler() {
        p = new cPortavions();
       d = new cDestructor();
       c = new cCuirassat();
        f = new cFragata();
        s = new cSubmari();
        dispars = new String[ALT][AMPLE];
        vaixells = new String[ALT][AMPLE];
    }

    public void colocarVaixells() {

        boolean valid = false;

        // 1. Colocar Portavions
        System.out.println("Portavions(4)");
        do {
            fila = llegirFila();
            columna = llegirColumna();
            direccio = llegirDireccio();
            p.colocar(fila, columna, direccio);
            valid = validarVaixell(p);
        }while(valid ==false);
        //introduixVaixeill(p);
        mostrarTauler();


        // Comprovar limitacions

        // 2. Colocar Cuirassat
        System.out.println("Cuirassat(3)");
        do {
        fila = llegirFila();
        columna = llegirColumna();
        direccio = llegirDireccio();
            c.colocar(fila, columna, direccio);
            valid = validarVaixell(c);
        }while(valid ==false);
        //introduixVaixeill(c);
        mostrarTauler();


        // desde columna hasta columna + p.tamany del portavions
        // vaixells[fila][columna] = "P"; només si es horizontal


        // 3. Colocar Destructor
        System.out.println("Destructor(2)");
        do {
            fila = llegirFila();
            columna = llegirColumna();
            direccio = llegirDireccio();
            d.colocar(fila, columna, direccio);
            d.colocar(fila, columna, direccio);
            valid = validarVaixell(d);
        }
        while (valid == false);
        //introduixVaixeill(d);
        mostrarTauler();

        // 4. Colocar fragata
        System.out.println("Fragata(1)");
        do {
            fila = llegirFila();
            columna = llegirColumna();
            f.colocar(fila, columna, direccio);
            valid = validarVaixell(f);
        }
        while (valid == false);
        //introduixVaixeill(f);
        mostrarTauler();

        // 5. Colocar submari
        System.out.println("Submari(3)");
        do {
            fila = llegirFila();
            columna = llegirColumna();
            direccio = llegirDireccio();
            s.colocar(fila, columna, direccio);
            valid = validarVaixell(s);
        }
        while (valid == false);
       //introduixVaixeill(s);
        mostrarTauler();

    }



    public void jocDisparar(){
        System.out.println("DISPARA");
        do {
            fila = llegirFila();
            columna = llegirColumna();
            dispararVaixells(fila, columna);
            mostrarTaulerDispars();
        }
        while(true);
    }

    //Metode de mostrar el tauler del joc.
    public void mostrarTauler() {
        int num = 65;                               //Variable per a fer a fer les lletres
        System.out.print(" ");
        for (int k = 1; k < 9; k++) {
            System.out.print("   " + (k) + " ");      //Imprimixca els nùmeros
        }
        System.out.println("");
        for (int i = 0; i < ALT; i++) {             //Primer for per a imprimir les files
            char caracter = (char) num;         //Canviar el valor de número per un caracter
            System.out.print(caracter + " ");   //Imprimir el caracter
            num++;                              //Incrementar el valor del nùmero
            for (int j = 0; j < AMPLE; j++) {
                if (vaixells[i][j] == null) {
                    System.out.print("[" + "_ ");//Imprimixca els recuadres
                } else {
                    System.out.print("[_" + vaixells[i][j]);
                }
                System.out.print("_]");
            }
            System.out.println("");
        }
    }

    public void mostrarTaulerDispars(){
        int num = 65;                               //Variable per a fer a fer les lletres
        System.out.print(" ");
        for (int k = 1; k < 9; k++) {
            System.out.print("   " + (k) + " ");      //Imprimixca els nùmeros
        }
        System.out.println("");
        for (int i = 0; i < ALT; i++) {             //Primer for per a imprimir les files
            char caracter = (char) num;         //Canviar el valor de número per un caracter
            System.out.print(caracter + " ");   //Imprimir el caracter
            num++;                              //Incrementar el valor del nùmero
            for (int j = 0; j < AMPLE; j++) {
                if (dispars[i][j] == null) {
                    System.out.print("[" + "_ ");//Imprimixca els recuadres
                } else {
                    System.out.print("[_" + dispars[i][j]);
                }
                System.out.print("_]");
            }
            System.out.println("");
        }
    }

    private int llegirFila() {
        int x = 0;
        do {
            System.out.print("Fila a introduir (A-H): ");
            if (scan.hasNext()) {
                char fila = scan.next().charAt(0);
                fila = Character.toUpperCase(fila);
                x = fila;
                x -= 65;
            }
            else{
                scan.next();
            }
        }
        while (x < 0 || x > 7);
        return x;
    }

    private int llegirColumna() {
        int y = 0;
        boolean comprovacio;
        do {
            System.out.print("Columna a introduir (1-8): ");
            if (scan.hasNextInt()) {
                comprovacio = true;
                y = scan.nextInt();
            }
            else {
                comprovacio = false;
                scan.nextLine();
            }
        }
        while (y < 0 || y > 8 || comprovacio == false);
        return y - 1;
    }

    private boolean llegirDireccio() {
        boolean posicion;

        System.out.print("Direcció a introduir (V - H): ");
        char direccion = scan.next().charAt(0);
        direccion = Character.toUpperCase(direccion);
        if (direccion == 'v' || direccion == 'V') {
            posicion = false;
        } else {
            posicion = true;

        }
        return posicion;
    }

    private boolean validarVaixell(cVaixell v) {
        boolean posValida = false;
        if (v.direccio == false) {
            if ((v.tamany + v.fila) > 8) {
                System.out.println("El vaixell s'en ix de la fila");
                return posValida = false;
            } else {
                for (int i = 0; i < v.tamany; i++) {
                    if (vaixells[v.fila+i][v.columna] != " ") {
                        System.out.println("Ja hi ha un vaixell en aquesta posició");
                        return posValida = false;
                    }
                }
                return posValida = true;
            }
        }else{
            if ((v.tamany + v.columna) > 8) {
                System.out.println("Se sale por abajo");
                return posValida = false;
            } else {
                for (int i = 0; i < v.tamany; i++) {
                    if (vaixells[v.fila][v.columna+i] != " ") {
                        System.out.println("Ja hi ha un vaixell en aquesta posició");
                        return posValida = false;
                    }
                }
                return posValida = true;
            }
        }
    }

    protected void rellenarTabler(){
        for (int i = 0; i < ALT; i ++){
            for (int j = 0; j < AMPLE; j++ ){
                vaixells[i][j] = " ";
                dispars[i][j] = " ";
            }
        }
    }

    /*private void introduixVaixeill(cVaixell v){
        if(v.direccio == false){
            for (int i = 0; i < v.tamany; i++) {
                vaixells[v.fila+i][v.columna] = v.ID;
            }
        }else{
            for (int i = 0; i < v.tamany; i++) {
                vaixells[v.fila][v.columna+i] = v.ID;
            }
        }

    }*/

    private void dispararVaixells(int fila, int columna){
        mostrarTaulerDispars();
        if (!vaixells[fila][columna].equals(" ") && !dispars[fila][columna].equals("O") && !dispars[fila][columna].equals("X")){
            System.out.print("TOCAT");
            dispars[fila][columna] = "X";
        }
        else{
            System.out.print("AIGUA");
            dispars[fila][columna] = "O";
        }
    }
}