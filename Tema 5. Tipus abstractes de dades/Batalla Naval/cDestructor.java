public class cDestructor extends cVaixell{
    static final int GRANDARIA = 2;

    protected cDestructor(){
        tamany = GRANDARIA;
        ID = "D";
    }
    public void colocar (int f, int c, boolean d) {
        fila     = f;
        columna  = c;
        direccio = d;
    }
}
