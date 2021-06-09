import java.awt.*;

public class cSubmari extends cVaixell{
    static final int GRANDARIA = 3;

    protected cSubmari(){
        tamany = GRANDARIA;
        //ID.setBackground(Color.YELLOW);
    }
    public void colocar (int f, int c, boolean d) {
        fila     = f;
        columna  = c;
        direccio = d;
    }
}
