import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        var random = new Random();
        System.out.println("*** NÚMEROS ALEATORIOS ***");
        var aleatorio = random.nextInt(11);
        System.out.print("Número aleatorio entre 0 Y 10: ");
        System.out.println(aleatorio);
        System.out.print("Número aleatorio entre 1 y 10: ");
        aleatorio = random.nextInt(9)+1;
        System.out.println(aleatorio);
    }
}
