public class ComparacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        System.out.println("cadena1 es igual en referencia a cadena2? = ");
        System.out.println(cadena1 == cadena2);
        System.out.println("cadena1 es igual en referencia a cadena3? = ");
        System.out.println(cadena1 == cadena3);
        System.out.println("cadena1 es igual en valor a cadena3? = ");
        System.out.println(cadena1.equals(cadena3));
    }
}