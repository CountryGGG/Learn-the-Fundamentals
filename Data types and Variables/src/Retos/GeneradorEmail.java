package Retos;

public class GeneradorEmail {
    public static void main(String[] args) {
        var nombre = "Ubaldo Acosta Soto";
        var empresa = "Global Mentoring";
        var dominio = "com.mx";

        var nombreGeneralizado = nombre.replace(" ",".").toLowerCase();
        System.out.println(nombreGeneralizado);
        var empresaGeneralizada = empresa.replace(" ","").toLowerCase();
        System.out.println(empresaGeneralizada);
        System.out.println(dominio);
        var correo = new StringBuilder();
        correo.append(empresaGeneralizada).append("@").append(dominio);

        System.out.println(String.join("@",nombreGeneralizado,correo));
    }
}