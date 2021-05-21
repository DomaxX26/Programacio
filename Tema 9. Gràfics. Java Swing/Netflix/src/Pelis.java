public class Pelis extends Contingut {
    public Pelis(String str) {
        if (str.isEmpty()) {
            return;
        }

        String[] info = str.split(";");
        this.titol = info[0];
        this.any = Integer.parseInt(info[1]);
        this.pais = info[2];
        this.genere = info[3];
        this.resum = info[4];
        this.director = info[5];
        this.actors = info[6];
    }

    public Pelis() {

    }

    public String toString() {
        return "Títol: " + this.titol + ", Any: " + this.any + ", País: " + this.pais + ", Genere: " + this.genere + ", Resum: " + this.resum + ", Director: " + this.director + ", Actor principal: " + this.actors;
    }
}
