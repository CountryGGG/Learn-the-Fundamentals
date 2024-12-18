public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        //Mas formas de concatenar cadenas en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena 3 usando + =" + cadena3);

        //Metodo concat
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("cadena 3 usando método concat = " + cadena3);

        //StringBuilder

        var stringBuilder = new StringBuilder();
        stringBuilder.append(cadena1).append(" ").append(cadena2);
        var resultado = stringBuilder.toString();
        System.out.println("Resultado con String Builder = " + resultado);

        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena3);
        resultado = stringBuffer.toString();
        System.out.println("Resultado con String Buffer" + resultado);

        //join
        var resultado2 = new String();
        resultado2 = String.join(" ", cadena1, cadena2);
        System.out.println("Resultado con el método join = " + resultado2);
    }
}