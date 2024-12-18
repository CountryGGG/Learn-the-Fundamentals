package Retos;

import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el Nombre de la receta: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Ingrese los ingredientes principales: ");
        var ingredientesPrincipales = consola.nextLine();
        System.out.print("Ingrese el tiempo de preparacion en minutos: ");
        var tiempoPreparacionMinutos = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese la dificultad (Fácil-Media-Difícil)");
        var dificultad = consola.nextLine();
        System.out.println();
        System.out.println("***RECETAS COCINA***");
        System.out.println("Nombre de la receta: " + nombreReceta);
        System.out.println("Ingredientes Principales: " + ingredientesPrincipales);
        System.out.println("Tiempo de preparación en minutos: " + tiempoPreparacionMinutos);
        System.out.println("Dificultad: " + dificultad);
    }
}
