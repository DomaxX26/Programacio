//Classe de la Sobrecarga de la Suma
public class sobrecargasuma {
    int sobrecargaSum(int num1, int num2){//Cride'm a les variables
        System.out.print("Suma de dos valors: " + num1 + " , " + num2 + "\n");//Mostra el missatge i els números
        return num1+num2;//Torna la suma
    }

    int sobrecargaSum(int num1, int num2, int num3){//Cride'm a les variables
        System.out.print("\n");// Fa un bot de línea per a que estiga separat cada operació
        System.out.print("Suma de tres valors: " + num1 + " , " + num2 + " , " + num3 + "\n");//Mostra el missatge i els números
        return num1+num2+num3;//Torna la suma
    }

    int sobrecargaSum(int num1, int num2, int num3, int num4){//Cride'm a les variables
        System.out.print("\n");// Fa un bot de línea per a que estiga separat cada operació
        System.out.print("Suma de quatre valors: " + num1 + " , " + num2 + " , " + num3 + " , " + num4 + "\n");//Mostra el missatge i els números
        return num1+num2+num3+num4;//Torna la suma
    }
}
