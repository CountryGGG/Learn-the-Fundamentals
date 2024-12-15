public class Producto {
    public static void main(String[] args) {
        String nombreProducto = "Lapiz";
        double precio = 3.99;
        int cantidadDisponible = 10;
        boolean disponibilidad = true;
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibilidad);

        System.out.println();

        //Modificamos los valores
        nombreProducto = "Lapicero";
        precio = 5.99;
        cantidadDisponible = 34;
        disponibilidad = true;
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibilidad);
    }
}
