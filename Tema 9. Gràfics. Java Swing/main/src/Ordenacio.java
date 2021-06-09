import javax.swing.*;

public class Ordenacio {
    public int [] array = {10,23,40,68,1};
    int cont1 = 1;
    int cont2 = 1;


    public static void main (String[]args){
        Ordenacio programa = new Ordenacio();
        programa.inici();
    }

    public void inici(){
        int menu;
        menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Elegix entre les dues opcions\n"
                + "1.Bambolla Ascendent\n"
                + "2.Bambolla Descendent"));
        switch (menu){
            case 1:
                System.out.println("--BAMBOLLA ASCENDENT--");
                bambollaAsc();
                break;
            case 2:
                System.out.println("--BAMBOLLA DESCENDENT--");
                bambollaDes();
                break;
        }
    }
    public void bambollaAsc() {
        int aux;

        for (int i = 0; (i < array.length); i++){
            for (int j = 0; (j < array.length - 1); j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
                mostrarPantallaAsc(i,j);
            }
        }
    }

    public void bambollaDes() {
        int aux;

        for (int i = 0; (i < array.length); i++){
            for (int j = 0; (j < array.length - 1); j++) {
                if (array[j] < array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
                mostrarPantallaDes(i,j);
            }
        }
    }

    private void mostrarPantallaAsc(int i, int j) {
        // S'ha de mostrar els index i, j, els elements dels arrays i si compleix la condició.
        System.out.println( cont1+"."+" Iteració " + cont1);
        cont1++;
        if (array[j] > array[j + 1]){
            System.out.print("Hi ha canvi");
        }else{
            System.out.print("No hi ha canvi");
        }
        for (int x : array) {
            System.out.print("\t" + x + " ");
        }
        System.out.println("==>" + " i val: " + i + " el nombre de i és: " + array[i] + ";" + " j val: " + j + " el nombre de j és: " + array[j]);
    }

    private void mostrarPantallaDes(int i, int j){
        System.out.println(cont2 + "."+"Iteració " + cont2);
        cont2++;

        for (int y: array) { ;
            System.out.print("\t" + y + " ");
        }
        System.out.println("==>" + " i val: " + i + " el nombre de i és: " + array[i] + ";" + " j val: " + j + " el nombre de j és: " + array[j]);
    }
}



