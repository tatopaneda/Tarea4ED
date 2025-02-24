package Inventario; // Añadido: Se movió la clase al paquete "inventario"

import java.util.ArrayList;

public class Inventario {
    public ArrayList<Producto> listaProductos;

    public Inventario() {
        listaProductos = new ArrayList<>();
    }

    public void agregar(Producto p) {
        listaProductos.add(p);
    }

    public void mostrar() {
        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductos.get(i).mostrarInformacion();
        }
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        // Modificado: Uso del método de fábrica "crearProducto" en lugar del constructor directo.
        Producto p1 = Producto.crearProducto("Laptop", 1200.99, 10);
        Producto p2 = Producto.crearProducto("Mouse", 25.50, 50);
        
        inventario.agregar(p1);
        inventario.agregar(p2);
        
        System.out.println("Inventario de productos:");
        inventario.mostrar();

        // Eliminado: Se quitaron las llamadas a "borrarDatos" ya que el método fue removido.
        // p1.borrarDatos();
        // p2.borrarDatos();
    }
}
