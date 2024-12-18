import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad: " + edad);
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("Altura: " + altura);
        System.out.print("Ingresa tu Nombre :");
        consola.nextLine();
        var nombre = consola.nextLine();
        System.out.println("Nombre: " + nombre);
    }
}
