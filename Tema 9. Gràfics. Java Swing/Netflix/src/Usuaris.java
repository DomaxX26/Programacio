import java.util.*;

public class Usuaris {
    public String nom;
    public String cognom1;
    public String cognom2;
    public String correu;
    public String contrasenya;

    public Usuaris(String str){
        if (str.isEmpty()){
            return;
        }

        String [] info = str.split(";");
        this.nom = info [0];
        this.cognom1 = info[1];
        this.cognom2 = info[2];
        this.correu = info[3];
        this.contrasenya = info[4];
    }

    public Usuaris(){}
    public String toString(){
        return "Nom: " + this.nom + ", Cognom 1: " + this.cognom1 + ", Cognom 2: " + this.cognom2 + ", Correu: " + this.correu + ", Contrasenya: " + this.contrasenya;
    }
}
