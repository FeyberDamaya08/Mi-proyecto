class ejeru2Prac2 {
    int ancho;
    int alto;

    ejeru2Prac2(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}

public class ejeru2Prac2 {

    public static void modificarRectangulo(ejeru2Prac2 r) {
        r.ancho = 50;
        r.alto = 30;
        System.out.println("Dentro del método: ancho = " + r.ancho + ", alto = " + r.alto);
    }

    public static void main(String[] args) {
        ejeru2Prac2 miRectangulo = new ejeru2Prac2(10, 20);
        System.out.println("Antes de modificar: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
        modificarRectangulo(miRectangulo);
        System.out.println("Después de modificar: ancho = " + miRectangulo.ancho + ", alto = " + miRectangulo.alto);
    }
}
