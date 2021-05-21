import javax.swing.*;
import java.util.Scanner;

public class Actividad17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu;
        //Mostrem un cartel per a que elegixques entre les dos opcions i comproves a la teua elecció.
        menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Elegix entre les dues opcions\n"
                + "1.Trobar lletra del DNI\n"
                + "2.Validar DNI"));
        //El switch case tens dos opcions per a elegir la opció que vuigues
        switch (menu){
            case 1:
                System.out.print("Introduce tu número de DNI: ");
                int dni = scan.nextInt();
                System.out.printf("La letra que corresponde a %d es %c", dni, calcularLetra(dni));
                scan.close();
                break;
            case 2:
                System.out.print("Introdueix el teu DNI: ");
                String miDNI = scan.nextLine();
                System.out.println(validarDNI(miDNI));
                break;
        }
    }

    //Calculem la lletra que deuriem tindre en el nostre DNI
    private static char calcularLetra(int dni){
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni%23;
        return caracteres.charAt(resto);
    }

    //Validem el DNI per si el caràcters no han segut correctes
    public static boolean validarDNI(String DNI){
        return DNI.matches("^[0-9]{7,8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|Q|E]$");
    }
}
