import java.io.Serializable;
import java.util.ArrayList;

public class Player implements Serializable {

    private String nombre;
    private String password;
    private int puntos;
    private ArrayList<String> historico;

    public Player(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
        puntos = 0;
        historico = new ArrayList<String>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPuntos() {
        return puntos;
    }

    /**
     * Aumenta los puntos del player.<br>
     * La puntuacion aumenta en 3 cuando se gana una partida.
     */
    public void aumentarPuntos() {
        puntos += 3;
    }

    /**
     * Añade una nueva anotación al histórico del Player.<br>
     * Existe un límite de 10 anotaciones, por lo que al alcanzar
     * este límite se eliminarán las anotaciones más antiguas para
     * dar cabida a las más recientes.
     * @param anotacion String con la anotación que queremos anotar.
     */
    public void anotarHistorico(String anotacion) {
        if (historico.size() == 10) { //Alcanzado límite de 10 anotaciones
            /*
             * En este caso se han de desplazar todas las anotaciones
             * una posición, eliminando así la más antigua (posición 0).
             * La nueva anotación queda como la más reciente (posición 9).
             */
            for (int i = 1; i < 9; i++)
                historico.set((i-1), historico.get(i));

            historico.set(9, anotacion);
        }
        else //Aun no tenemos 10 anotaciones, añadimos sin más.
            historico.add(anotacion);
    }

    /**
     * Muestra el histórico de resultados de las partidas
     * jugadas por el Player.
     * @return String con todas las anotaciones del histórico.
     */
    public String mostrarHistorico() {
        StringBuilder sb = new StringBuilder("\t\tHISTÓRICO");
        sb.append("\t\t---------\n");
        for (String anotacion: historico)
            sb.append(anotacion + "\n");

        return sb.toString();
    }


    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof Player) { //Es un objeto Player
            Player otroPlayer = (Player)objeto;
            //Dos Player son iguales si tienen mismo nombre
            return nombre.equals(otroPlayer.nombre);
        }
        else
            return false; //Ni siquiera es un objeto Player
    }

}
