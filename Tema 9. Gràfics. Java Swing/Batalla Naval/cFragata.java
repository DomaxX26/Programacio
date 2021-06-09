import java.awt.*;

public class cFragata extends cVaixell{
    static final int GRANDARIA = 1;

    protected cFragata(){
        tamany = GRANDARIA;
        //ID.setBackground(Color.YELLOW);
    }
    public void colocar (int f, int c, boolean d) {
        fila     = f;
        columna  = c;
        direccio = d;
    }
}
