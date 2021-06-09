public class Serie extends Contingut{

    public int temporades;
    public int anyTemporada;
    public int capitolTemporada;
    public String titolCapitol;
    public String sinopsis;

    public Serie(String str){
      if (str.isEmpty()){
          return;
      }

      String [] info = str.split(";");
      this.titol = info[0];
      this.any = Integer.parseInt(info[1]);
      this.pais = info[2];
      this.genere = info[3];
      this.resum = info[4];
      this.temporades = Integer.parseInt(info[5]);
      this.anyTemporada = Integer.parseInt(info[6]);
      this.capitolTemporada = Integer.parseInt(info[7]);
      this.titolCapitol = info[8];
      this.sinopsis = info[9];
      this.director = info[10];
      this.actors = info[11];

    }

    public Serie(){

    }
    public String toString(){
        return "Títol: " + this.titol + ", Any: " + this.any + ", País: " + this.pais + ", Genere: " + this.genere + ", Resum: " + this.resum + ", Temporades: " + this.temporades + ", Any de la Temporada: " + this.anyTemporada + ", Nº de Capitols: " + this.capitolTemporada + "Titul del Capitol: " + this.titolCapitol + ", Sinopsis: " + this.sinopsis + ", Director: " + this.director + ", Actor principal: " + this.actors;
    }
}
