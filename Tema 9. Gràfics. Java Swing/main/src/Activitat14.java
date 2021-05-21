import java.util.Scanner;



public class Activitat14 {
    //Programa principal que és el que mostra per pantalla tot el programa.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.print("Dona'm un nombre: ");
        num1 = scan.nextInt();

        System.out.print("Dona'm un segon nombre: ");
        num2 = scan.nextInt();

        System.out.println("El Mínim Comú Múltiple de " + num1 + " i " + num2 + " és = " + mcm(num1, num2));
        System.out.print("La descomposició del nombre introduït " + num1 +" és: ");
        factor1(num1);
        System.out.println("");
        System.out.print("La descomposició del nombre introduït " + num2 +" és: ");
        factor2(num2);
    }

    //Mínim comú múltiple
    public static int mcm(int num1, int num2) {
        int mcm = 1;
        int i = 2;

        while (i <= num1 || i <= num2) {

            if (num1 % i == 0 || num2 % i == 0) {
                mcm = mcm * i;
                if (num1 % i == 0) num1 = num1 / i;
                if (num2 % i == 0) num2 = num2 / i;
            } else {
                i = i + 1;
            }
        }
        return mcm;
    }

    //Descomposició factorial del primer nombre.
    public static void factor1 (int num1){
        int num = 2;
        while(num1!=1){
            if(num1%num==0){
                num1=num1/num;
                System.out.print(num + " ");
            }else {
                num++;
            }

        }
    }

    //Descomposició factorial del segon nombre.
    public static void factor2 (int num2){
        int num = 2;
        while(num2!=1){
            if(num2%num==0){
                num2=num2/num;
                System.out.print(num + " ");
            }else {
                num++;
            }

        }
    }
}



