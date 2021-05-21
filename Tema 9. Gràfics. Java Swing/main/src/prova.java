import java.util.Scanner;
public class prova {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int milla = 1852;
        int num=1;
        int resultat;
        System.out.print("Introduiex un valor: ");
        num = scan.nextInt();
        resultat = num * milla;
        System.out.print("El resultat es: " + resultat);

    }
}
