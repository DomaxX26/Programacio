
public class Actividad16 {
    //És la estrucutura principal del programa
    public static void main(String[] args) {

        //Importe'm la classe de sobrecargasuma per a poder utlitzar-la en aquesta classe.
        sobrecargasuma Suma = new sobrecargasuma();
        int sumaint, multiplicacioint; //Declaració de les variables


        sumaint = Suma.sobrecargaSum(5, 3); //Són els números per a fer la suma.
        System.out.print("El resultat de la suma de 5 + 3 és: " + sumaint + "\n"); //Es mostra per pantalla el resultat de la suma.

        sumaint = Suma.sobrecargaSum(5, 3, 2);//Són els números per a fer la suma.
        System.out.print("El resultat de la suma de 5 + 3 + 2 és: " + sumaint + "\n");//Es mostra per pantalla el resultat de la suma.

        sumaint = Suma.sobrecargaSum(5, 3, 2, 1);//Són els números per a fer la suma.
        System.out.print("El resultat de la suma de 5 + 3 + 2 + 1 és: " + sumaint + "\n");//Es mostra per pantalla el resultat de la suma.

        //Importe'm la classe de sobrecargamultipliació per a poder utlitzar-la en aquesta classe.
        sobrecargamultiplicació Multiplicació = new sobrecargamultiplicació();

        multiplicacioint = Multiplicació.sobrecargaMul(5, 3);//Són els números per a fer la multiplicació.
        System.out.print("El resultat de la multiplicació de 5 * 3 és: " + multiplicacioint + "\n");//Es mostra per pantalla el resultat de la multiplicació.

        multiplicacioint = Multiplicació.sobrecargaMul(5, 3, 2);//Són els números per a fer la multiplicació.
        System.out.print("El resultat de la multiplicació de 5 * 3 * 2 és: " + multiplicacioint + "\n");//Es mostra per pantalla el resultat de la multiplicació.

        multiplicacioint = Multiplicació.sobrecargaMul(5, 3, 2, 1);//Són els números per a fer la multiplicació.
        System.out.print("El resultat de la multiplicació de 5 * 3 * 2 * 1 és: " + multiplicacioint + "\n");//Es mostra per pantalla el resultat de la multiplicació.
    }
}
