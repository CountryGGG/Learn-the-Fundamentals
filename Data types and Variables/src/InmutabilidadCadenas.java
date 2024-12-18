public class InmutabilidadCadenas {
    public static void main(String[] args) {
        var cadena1 = "Java";
        var cadena2 = cadena1;
        System.out.println("cadena1: " + cadena1);
        System.out.println("cadena2: " + cadena2);
        cadena1 = "Python";
        System.out.println("cadena1: " +cadena1);
        System.out.println("cadena2: " + cadena2);

    }
}
