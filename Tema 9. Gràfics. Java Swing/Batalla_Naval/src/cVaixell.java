import javax.swing.*;
import java.awt.*;

public class cVaixell {
    protected int fila;
    protected int columna;
    protected boolean direccio;
    protected int tamany;
    public JButton ID;

    public cVaixell () {

    }
    public void colocar (int f, int c, boolean d) {
        fila     = f;
        columna  = c;
        direccio = d;
    }
}
