import java.util.Scanner; 

public class Exercici1 {
	public static void main (String []args) {
		Scanner scan = new Scanner (System.in);
			System.out.println("Escribe el primer valor deseado");
			int A = Integer.parseInt(scan.nextLine());
			System.out.println("Escribe el segundo valor deseado");
			int B = Integer.parseInt(scan.nextLine());
			System.out.println("Escribe el tercer valor deseado");
			int C = Integer.parseInt(scan.nextLine());
		
		if ( A > B && A > C) {
			System.out.println(A + " és el nombre major");
		}
		
		else if (B > C){
			System.out.println(B + " és el nombre major");
		}
		else {
			System.out.println(C + " és el nombre major");		
			}
	}
}
