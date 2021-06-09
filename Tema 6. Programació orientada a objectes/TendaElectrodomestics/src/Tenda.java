import java.util.*;


public class Tenda {
    private static Tenda programa;
    private static Agenda agenda;
    private static Estoc estoc;
    private static Compra compra;
    private String [] Menu = new String[4];
    private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        programa = new Tenda();
        agenda = new Agenda();
        estoc = new Estoc();
        programa.comprobarMenuTenda();
    }

    public void comprobarMenuTenda(){
        int menu = -1;
        do {
            inicialiatzarMenu();
            mostrarPrograma();
            System.out.print("Introdueix un valor de 1-4 per a elegir un programa: ");
            if (scan.hasNextInt()){
                menu = scan.nextInt();
                if (menu >= 1 || menu <= 4) {
                    switchPrograma(menu);
                }
                else{
                    System.out.println("Opció incorrecta, no has seleccionat un nùmero correcte.");
                }
            }
            else{
                scan.next();
                System.out.print("Valor introduït incorrecte, introdueix un valor (1 al 4).");
            }
        }
        while (menu < 1 || menu > 4);
    }

    public void mostrarClients(){
        ArrayList<Client> llista = agenda.getClients();
        Iterator<Client> iter = llista.iterator();
        while (iter.hasNext()){
            Client c = (Client) iter.next();
            System.out.println(c.toString());
        }
    }

    public void mostrarEstufa(){
        ArrayList<Estufa> estufaArrayList = estoc.getEstufesList();
        Iterator<Estufa> iter = estufaArrayList.iterator();
        while (iter.hasNext()){
            Estufa e = (Estufa) iter.next();
            System.out.println(e.toString());
        }
    }

    public void mostrarForn(){
        ArrayList<Forn> fornArrayList = estoc.getFornsList();
        Iterator<Forn> iter = fornArrayList.iterator();
        while (iter.hasNext()){
            Forn f = (Forn) iter.next();
            System.out.println(f.toString());
        }
    }

    public void mostrarLlavadora(){
        ArrayList<Llavadora> llavadoraArrayList = estoc.getLlavadoresList();
        Iterator<Llavadora> iter = llavadoraArrayList.iterator();
        while (iter.hasNext()){
            Llavadora l = (Llavadora) iter.next();
            System.out.println(l.toString());
        }
    }

    public void mostrarMicroones(){
        ArrayList<Microones> microonesArrayList = estoc.getMicrosList();
        Iterator<Microones> iter = microonesArrayList.iterator();
        while (iter.hasNext()){
            Microones e = (Microones) iter.next();
            System.out.println(e.toString());
        }
    }

    public void mostrarNevera(){
        ArrayList<Nevera> neveraArrayList = estoc.getNeveresList();
        Iterator<Nevera> iter = neveraArrayList.iterator();
        while (iter.hasNext()){
            Nevera n = (Nevera) iter.next();
            System.out.println(n.toString());
        }
    }

    public void mostrarTelevisio(){
        ArrayList<Televisio> televisioArrayList = estoc.getTelesList();
        Iterator<Televisio> iter = televisioArrayList.iterator();
        while (iter.hasNext()){
            Televisio t = (Televisio) iter.next();
            System.out.println(t.toString());
        }
    }

    private void inicialiatzarMenu(){
        Menu [0] = "[1] Agenda";
        Menu [1] = "[2] Estoc";
        Menu [2] = "[3] Compra";
        Menu [3] = "[4] Eixir programa";
    }

    private void mostrarPrograma(){
        System.out.print("------------MENÚ TENDA------------\n");
        for (String m: Menu) {
            System.out.print(m + "\n");
        }
    }

    private void switchPrograma(int menu){
        switch (menu){
            case 1:
                agenda.comprobarMenuAgenda();
                break;
            case 2:
                estoc.comprobarMenuEstoc();
               break;
            case 3:

              break;
            case 4:
                System.out.println("Tancant programa");
                break;
        }
    }

}
