package Retos;

import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        System.out.println("***SISTEMA DE ID GENERADOR ÚNICO***");
        var consola = new Scanner(System.in);
        var aleatorio = new Random();

        //Solicitamos nombre de usuario
        System.out.print("¿Cual es tu nombre? ");
        var nombre = consola.nextLine();

        //Solicitamos el apelllido
        System.out.print("¿Cual es tu apellido? ");
        var apellido = consola.nextLine();

        //Solicitamos años de nacimiento
        System.out.println("¿Cual es tu año de nacimiento?");
        var anioNacimiento = consola.nextLine();

        //Normalizar los valores
        var nombre2 = nombre.trim().toUpperCase().substring(0,2);
        var apellido2 = apellido.trim().toUpperCase().substring(0,2);
        var anionacimiento2 = anioNacimiento.trim().substring(2);

        //Generar número aleatorio
        var numeroAleatorio = aleatorio.nextInt(9999) + 1;

        //Formato a número aleatorio
        var numeroAleatorioFormato = String.format("%04d",numeroAleatorio);

        //Generar el ID Único
        var idUnico = nombre2 + apellido2 + anionacimiento2 + numeroAleatorioFormato;

        //Imprimir ID Único
        System.out.printf("""
                %nHola %s,
                \tTu nuevo número de identificación generado por el sistema es:\s %s
                \t¡Felicidades!
                """,nombre,idUnico);
    }
}
