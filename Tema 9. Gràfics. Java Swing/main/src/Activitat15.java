import java.util.Scanner;

public class Activitat15 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            //Cridem a la Classe del Guerrer
            Guerrer soldat = new Guerrer();

            System.out.println("Nom del guerrer: " + soldat.getNom());//Agarra el nom de la classe del Guerrer
            soldat.setNom("Jalobo"); //Nom de del següent Guerrer
            System.out.println("Nom del guerrer: " + soldat.getNom() + "\n");//Agarra el nom de la classe principal

            System.out.println("Edat del guerrer: " + soldat.getEdat());//Agarra la edat de la classe del Guerrer
            soldat.edat = 21;//Edat de del següent Guerrer
            System.out.println("Edat del guerrer: " + soldat.getEdat() + "\n");//Agarra la edat de la classe principal

            System.out.println("Tipus de guerrer: " + soldat.getTipus());//Agarra el tipus de la classe del Guerrer
            soldat.setTipus("Samurai");//Tipus de del següent Guerrer
            System.out.println("Tipus de guerrer: " + soldat.getTipus() + "\n");//Agarra la edat de la classe principal

            System.out.println("Nacionalitat del guerrer: " + soldat.getNacionalitat());//Agarra la nacionalitat de la classe del Guerrer
            soldat.setNacionalitat("Àfrica");//Nacionalitat de del següent Guerrer
            System.out.println("Nacionalitat del guerrer: " + soldat.getNacionalitat() + "\n");//Agarra la edat de la classe principal

            System.out.println("Arma del guerrer: " + soldat.getArma());//Agarra el arma de la classe del Guerrer
            soldat.setArma("Katana");//Arma  del següent Guerrer
            System.out.println("Arma del guerrer: " + soldat.getArma() + "\n");//Agarra la edat de la classe principal

            System.out.println("Defensa del guerrer: " + soldat.getDefensa());//Agarra la defensa de la classe del Guerrer
            soldat.setDefensa("Bomba de fum");//Defensa del següent Guerrer
            System.out.println("Defensa del guerrer: " + soldat.getDefensa() + "\n");//Agarra la edat de la classe principal

            System.out.println("Combats totals del guerrer: " + soldat.getNumComb());//Agarra els combats de la classe del Guerrer
            soldat.numComb = 65;//Combats del següent Guerrer
            System.out.println("Combats totals del guerrer: " + soldat.getNumComb() + "\n");//Agarra la edat de la classe principal

            System.out.println("Combats guanyats del guerrer: " + soldat.getWinComb());//Agarra els combats guanyats de la classe del Guerrer
            soldat.winComb = 60;//Combats guanyats del següent Guerrer
            System.out.println("Combats guanyats del guerrer: " + soldat.getWinComb() + "\n");//Agarra la edat de la classe principal

            System.out.println("Combats perduts del guerrer: " + soldat.getLoseComb());//Agarra els combats perduts de la classe del Guerrer
            soldat.loseComb = 5;//Combats perduts del següent Guerrer
            System.out.println("Combats perduts del guerrer: " + soldat.getLoseComb() + "\n");//Agarra la edat de la classe principal
        }
    }

