public class Cadenas {
    public static void main(String[] args) {
        System.out.println("***MANEJO DE CADENAS EN JAVA***");
        var cadena1 = "Hola";
        System.out.println("Cadena 1= " + cadena1);
        var cadena2 = new String("Mundo");
        System.out.println(cadena2);
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);
        //Cadena de multiples lineas
        var cadena4 = """
                Este es un texto
                multilinea
                en
                java
                """;
        System.out.println("cadena4 = " + cadena4);
    }
}
