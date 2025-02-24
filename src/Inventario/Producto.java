package Inventario;  // Añadido: Se movió la clase al paquete "inventario"

public class Producto {
    // Modificado: Encapsulado y renombrado el atributo "n" a "nombre"
    private String nombre;  
    // Modificado: Encapsulado y renombrado el atributo "p" a "precio"
    private double precio;
    // Modificado: Encapsulado y renombrado el atributo "s" a "stock"
    private int stock;

    /**
     * Constructor privado para forzar el uso del método de fábrica.
     * Modificado: Cambiado de "public" a "private" y actualizadas las asignaciones.
     */
    private Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Método de fábrica para crear un Producto.
     * Añadido: Método estático para crear instancias de Producto.
     */
    public static Producto crearProducto(String nombre, double precio, int stock) {
        return new Producto(nombre, precio, stock);
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
    }

    // Eliminado: Se ha removido el método "borrarDatos" tras refactorizar.

    // Añadido: Métodos getter y setter para acceder a los atributos encapsulados.
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}