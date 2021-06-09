import java.util.ArrayList;

public class Tablero {

    /*
     * El tablero será una matriz 8x8 de tipo int.
     * 0 -> Casilla sin desvelar
     * 1 -> Barco
     * 2 -> Barco Tocado
     * 3 -> Agua/Disparo fallido
     */
    private int[][] tablero;
    private ArrayList<Barco> barcos;

    public Tablero() {
        tablero = new int[8][8];
        barcos = new ArrayList<Barco>();
    }

    /**
     * Agrega un Barco a la lista de Barcos.<br>
     * Además actualiza los valores del tablero para
     * representar la posición del Barco.
     * @param barco Objeto Barco que añadimos al tablero.
     */
    public void addBarco(Barco barco) {
        barcos.add(barco);
        //Modificamos tablero según coordenadas nuevo Barco
        for (PuntoXY coord: barco.coordenadas)
            tablero[coord.x][coord.y] = 1;
    }

    /**
     * Recibe un disparo (un objeto PuntoXY) y comprueba
     * si coincide con las coordenadas de algún barco de este
     * tablero.<br>Si coincide, es que un Barco ha sido tocado.
     * De lo contrario, el disparo ha fallado.<br>
     * Los valores del tablero se actualizan según lo que haya ocurrido.
     * @param disparo Objeto PuntoXY con las coordenadas donde se ha disparado.
     * @return <i>True</i> si se ha tocado un Barco, <i>False</i> en caso contrario.
     */
    public boolean evaluarDisparo(PuntoXY disparo) {
        //De entrada consideramos el disparo como fallido
        tablero[disparo.x][disparo.y] = 3;
        /*
         * Ahora recorremos los barcos y comprobamos si
         * alguno tiene coordenada coincidente con
         * el disparo.
         * Si coincide, corregimos el valor del tablero
         * para la coordenada del disparo
         */

        for (Barco barco: barcos) {
            if (barco.evaluaDisparo(disparo)) {
                tablero[disparo.x][disparo.y] = 2; //El disparo ha tocado barco
                return true;
            }
        }
        //Si el bucle no ha retornado true, el que el disparo se ha confirmado como fallido
        return false;
    }

}
