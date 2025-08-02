// Clase abstracta que define la estructura común de todos los productos
abstract class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método abstracto que será implementado por las subclases
    public abstract void mostrarDetalles();
}

// Clase que representa un producto electrónico
class Electronico extends Producto {
    private String marca;

    public Electronico(String nombre, double precio, String marca) {
        super(nombre, precio);
        this.marca = marca;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Electrónico: " + nombre + ", Precio: $" + precio + ", Marca: " + marca);
    }
}

// Clase que representa un producto alimenticio
class Alimento extends Producto {
    private String fechaExpiracion;

    public Alimento(String nombre, double precio, String fechaExpiracion) {
        super(nombre, precio);
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Alimento: " + nombre + ", Precio: $" + precio + ", Expira: " + fechaExpiracion);
    }
}

// Clase que representa un producto de ropa
class Ropa extends Producto {
    private String talla;

    public Ropa(String nombre, double precio, String talla) {
        super(nombre, precio);
        this.talla = talla;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Ropa: " + nombre + ", Precio: $" + precio + ", Talla: " + talla);
    }
}

// Clase principal que demuestra el uso de polimorfismo
public class Main {
    public static void main(String[] args) {
        // Creamos productos de diferentes tipos utilizando la clase abstracta como referencia
        Producto p1 = new Electronico("Laptop", 15000, "Dell");
        Producto p2 = new Alimento("Pan", 30, "2025-09-01");
        Producto p3 = new Ropa("Camiseta", 200, "M");

        // Usamos el mismo método de forma polimórfica para mostrar detalles
        p1.mostrarDetalles();
        p2.mostrarDetalles();
        p3.mostrarDetalles();
    }
}
