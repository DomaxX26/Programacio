import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class BattleShip {

    private ArrayList<Player> jugadores;
    private Player jugador1;
    private Player jugador2;
    private int dificultad;//1-EASY, 2-NORMAL, 3-EXPERT, 4-GENIUS
    private int modo; //1-TUTORIAL, 2-ARCADE
    private Tablero tablero1;
    private Tablero tablero2;

    public BattleShip() {
        cargarPlayers();

        jugador1 = null;
        jugador2 = null;
        dificultad = 2; //Dificultad por defecto
        modo = 1; //Modo de juego por defecto
        tablero1 = new Tablero();
        tablero2 = new Tablero();
    }


    /**
     * Recibe un Player para añadir al listado. El nuevo Player quedará logueado<br>
     * El Player será rechazado si ya existe otro con el mismo nombre.
     * @param jugador Objeto Player que queremos registrar.
     * @return <i>True</i> si se admitó el registro,
     * <i>False</i> si ha sido rechazado.
     */
    public boolean addPlayer(Player jugador) {
        if (jugadores.contains(jugador)) {
            JOptionPane.showMessageDialog(null, "Este Jugador ya está registrado", "Nuevo Jugador",
                    JOptionPane.WARNING_MESSAGE);
            return false; //Ya existe este Player, lo rechazamos
        }
        else {
            jugadores.add(jugador);
            jugador1 = jugador; //El nuevo usuario queda logueado
            guardarPlayers(); //Guardamos en disco
            return true;
        }
    }

    /**
     * Recibe nombre y password para comprobar si existe un Player registrado
     * con estos datos.<br>Si existe, este Player queda logueado.
     * @param datos Array String[] con nombre y password.
     * @return <i>True</i> si los datos son válidos, <i>False</i> en caso contrario.
     */
    public boolean validarLogin(String[] datos) {
        //Recorremos jugadores y buscamos mismo nombre, y mismo password
        for (Player player: jugadores)
            if (player.getNombre().equals(datos[0]) && player.getPassword().equals(datos[1])) {
                //Login valido
                jugador1 = player;
                return true;
            }
        //Finalizado bucle for sin retornar true, es que el login no es válido
        return false;
    }

    /**
     * Guarda en disco los Players registrados.
     */
    private void guardarPlayers() {

        //File fichero = new File("datos/players.dat");
        String strFilePath = System.getProperty("user.dir");
        strFilePath += File.separator + "src/players.txt";
        File fichero = new File(strFilePath);

        try {
            if (!fichero.exists())
                fichero.createNewFile();
            ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream(fichero));
            obs.writeObject(jugadores); //Grabamos objeto ArrayList<Player> en disco
            obs.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a " + fichero.getAbsolutePath(),
                    "Guarder Players", JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * Recupera los datos guardados en disco de Players registrados,
     * si los hubiera.
     */
    private void cargarPlayers() {
        jugadores = new ArrayList<Player>(); //Por si acaso no hay datos
        //Ahora, buscamos datos guardados
        String strFilePath = System.getProperty("user.dir");
        strFilePath += File.separator + "src/players.txt";
        File fichero = new File(strFilePath);
        if (fichero.exists()) { //Hay un fichero en disco
            ObjectInputStream ois;
            try {
                ois = new ObjectInputStream(new FileInputStream(fichero));
                Object aux = ois.readObject();
                jugadores = (ArrayList<Player>)aux;
                ois.close();
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "No se encuentra " + fichero.getAbsolutePath(),
                        "Cargar Players", JOptionPane.WARNING_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "No se puede acceder a " + fichero.getAbsolutePath(),
                        "Cargar Players", JOptionPane.WARNING_MESSAGE);
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Los datos recuperados no son válidos",
                        "Cargar Players", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    /**
     * Hace que el Player que actualmente consta
     * logueado como jugador1, deje de estarlo.
     */
    public void logoutPlayer1() {
        jugador1 = null;
    }
}
