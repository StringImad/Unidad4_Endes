package refactorizacion;

public class CasoA {
//Realizado

    static void printCuenta(String nombre, double cantidad) {
        printLogo();
        printDetalles(nombre, cantidad);

    }

    static void printDetalles(String nombre, double cantidad) {

        System.out.println("nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);

    }

    static void printLogo() {

        System.out.println("LOGO");
    }

    public static void main(String[] args) {

        printCuenta("Antonio", 200.00);
    }

}
