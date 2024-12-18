public class IndiceCadena {
    public static void main(String[] args) {
        var caracter = "Hola mundo";

        var primerCaracter = caracter.charAt(0);
        var ultimoCaracter = caracter.charAt(9);

        System.out.println("caracter: " + caracter);
        System.out.println("primer caracter: " + primerCaracter);
        System.out.println("ultimo caracter: " + ultimoCaracter);

        //Recuperando caracter del M

        var mediocaracter = caracter.charAt(5);
        System.out.println("caracter del medio: " + mediocaracter);
    }
}
