public class ManejoSubcadenas {
    public static void main(String[] args) {
        //Subcadenas substring(INICIO,FINAL(CON/SIN INCLUIRLO)
        var cadena1 = "Hola Mundo das";
        var subcadena1 = cadena1.substring(0,4);
        var subcadena2 = cadena1.substring(5,10);
        System.out.println(cadena1);
        System.out.println(subcadena1);
        System.out.println(subcadena2);
    }
}