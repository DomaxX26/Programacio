import java.util.Scanner;

public class valorintroducido {
	public static void main (String[]args) {
	 Scanner scan = new Scanner (System.in);
	 int num;
	 System.out.print("Dona'm número entre 444 i 888: ");
	 num = scan.nextInt();
	 if (num >= 444 && num <= 888) {
		 System.out.println("El número introduït és correcte");
	 }
	 else {
		 System.out.println("El número introduït no es correcte entre dins del valors demanats");
	 }
	}
}
