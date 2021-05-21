//Fem les variables
public class Guerrer {
    String nom, tipus, nacionalitat, arma, defensa;
    public int edat;
    public int numComb;
    public int winComb;
    public int loseComb;

    //Declarar les propietats del personatge
    public Guerrer(){
        nom = "Mastodonte";
        edat = 18;
        tipus = "Gormiti tipo planta";
        nacionalitat = "ESPANYA";
        arma = "Bandera de Espanya";
        defensa = "Escut de Espanya";
        numComb = 50;
        winComb = 40;
        loseComb = 10;
    }

    //nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    //edat
    public int getEdat() {
        return edat;
    }

    //tipus
    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getTipus() {
        return tipus;
    }

    //nacionalitat
    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    //arma
    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getArma() {
        return arma;
    }

    //defensa
    public void setDefensa(String defensa) {
        this.defensa = defensa;
    }

    public String getDefensa() {
        return defensa;
    }

    //numero combats
    public int getNumComb() {
        return numComb;
    }

    //combats guanyats
    public int getWinComb() {
        return winComb;
    }

    //combats perduts
    public int getLoseComb() {
        return loseComb;
    }
}