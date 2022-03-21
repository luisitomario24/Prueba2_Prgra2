package PruebaFinal_2;

public class miExcepcion extends IndexOutOfBoundsException {

    public miExcepcion(int a) {
        super(a + "Numero invalido.");
    }

}
