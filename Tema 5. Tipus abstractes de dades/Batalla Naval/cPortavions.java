public class cPortavions extends cVaixell{
    static final int GRANDARIA = 4;

    protected cPortavions () {
        tamany = GRANDARIA;
        ID = "P";
    }

    public void colocar (int f, int c, boolean d) {
        fila     = f;
        columna  = c;
        direccio = d;
    }
}
