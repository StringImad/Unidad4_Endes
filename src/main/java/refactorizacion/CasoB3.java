package refactorizacion;

public class CasoB3 {

    public static void main(String[] args) {
       // System.out.println(incrementoPrecioBase());
    }

     double incrementoPrecioBase() {
//        double preciobase = cantidad * preciounitario;
        if (precioBase() > 1000) {
            return precioBase() * 0.90;
        } else {
            return precioBase() * 0.95;
        }
    }

    double  precioBase() {
        int cantidad = 0;
        double preciounitario = 0;
        double precioBase = cantidad * preciounitario;

        return cantidad * preciounitario;
    }

}
