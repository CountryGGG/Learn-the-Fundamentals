package Retos;

public class ReservadeHoteles {
    public static void main(String[] args) {
        final var NOMBRE_DE_CLIENTE = "TYRON";
        var diasInstancia = 5;
        var tarifaDiaria = 90.99f;
        final var VISTA_AL_MAR = false;

        System.out.println("nombreCliente = " + NOMBRE_DE_CLIENTE);
        System.out.println("diasInstancia = " + diasInstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("vistaMar = " + VISTA_AL_MAR);

        System.out.println(" ");

        //Modifico algunos Valores
        diasInstancia = 3;
        tarifaDiaria = 60.00f;
        System.out.println("nombreCliente = " + NOMBRE_DE_CLIENTE);
        System.out.println("diasInstancia = " + diasInstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("vistaMar = " + VISTA_AL_MAR);
    }
}
