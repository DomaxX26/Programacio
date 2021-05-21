import java.util.Scanner;

public class Taulamultiplicar {
	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduix el valor que vuigues: ");
		int contador = 10;
		int contmulti = 0;
		int contmulti1 = 0;
		int multiplicar = Integer.parseInt(scan.nextLine());
		for ( int i = 1; i <= contador; i++) {
			contmulti = i;
			contmulti1 = i * multiplicar;
			System.out.println(contmulti + "*" + multiplicar + "=" + contmulti1);
		}
		
		
		
	}
}
