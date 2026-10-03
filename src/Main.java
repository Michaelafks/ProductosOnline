public static void main(String[] args) {

    Producto producto1 = new Producto();
    Producto producto2 = new Producto();
    Producto producto3 = new Producto();

    producto1.nombre = "Audifonos Bluetooth";
    producto1.precio = 32.50;
    producto1.categoria = "Tecnologia";
    producto1.disponible = true ;

    producto2.nombre = "Iphone 17 Pro Max";
    producto2.precio = 1300;
    producto2.categoria = "Tecnologia";
    producto2.disponible = false ;

    producto2.nombre = "Ipad";
    producto2.precio = 800;
    producto2.categoria = "Tecnologia";
    producto2.disponible = true ;

    producto1.mostrarInformacion();
    producto1.cambiarDisponibilidad(false);
    producto1.mostrarDisponibilidad();

}