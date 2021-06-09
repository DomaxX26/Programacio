import java.util.Scanner; //Importamos la libreria del Scanner

public class juego {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Declaramos nombre del Scannner
        System.out.println("Has d'endevinar un nombre de l'1 fins al 50"); //Mostramos por pantalla
        System.out.println("_____________________________________________"); //Mostramos por pantalla
        int random = (int) (Math.random() * 50) + 1;
        boolean verdadero = true;
        boolean falso = false;
        int cerrar;
        int num = 0;

        while (verdadero == true) { // Empieza el bucle
            for (int i = 1; i < 6; i++) { //Hace 5 veces el bucle de pedir números
                System.out.print("Intent nombre " + i + ": Dona'm un nombre: ");//Mostramos por pantalla con el número de intentos
                num = scan.nextInt(); //Escanea el número introducido

                if (num == random) {
                    System.out.println("****************************************************");//Mostramos por pantalla
                    System.out.println("Hui és el teu dia de sort, has encertat en el intent " + i);//Mostramos por pantalla con número del acierto realizado
                    System.out.println("****************************************************");//Mostramos por pantalla
                    break;
                }
            }
            if (num != random) {
                System.out.println("________________________________________________");//Mostramos por pantalla
                System.out.println("GAME OVER, el nombre a l'azar era el : " + random);//Mostramos por pantalla con el número que era para acertarlo
                System.out.println("________________________________________________");//Mostramos por pantalla
            }

                System.out.println("Si vols jugar una altra vegada: posa la paraula TRUE a continuació, escriu FALSE per a finalitzar el programa.");//Mostramos por pantalla
                verdadero = scan.nextBoolean();//Escanea el valor booleano introducido
                random = (int) (Math.random() * 50) + 1;

            if (verdadero == false){
                System.out.print("Programa finalizado");//Mostramos por pantalla
                break;
            }
        }
    }
}
