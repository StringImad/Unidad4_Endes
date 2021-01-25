package refactorizacion;

public class CasoB {
//Realizado
    static int numerodecervezas = 6;

    static int rondaGratis() {

        return (numerodecervezas > 5) ? 2 : 1;
    }

//    static boolean masde5cervezas() {
//        return numerodecervezas > 5;
//    }

    public static void main(String[] args) {

        System.out.println(rondaGratis());

    }

}
