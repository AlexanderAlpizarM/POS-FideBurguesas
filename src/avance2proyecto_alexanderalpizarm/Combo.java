package avance2proyecto_alexanderalpizarm;
import java.io.Serializable;
import java.util.ArrayList;

public class Combo implements Serializable, Comparable<Combo> {

    private static final long serialVersionUID = 1L;

    // Atributos
    private int id;
    private String nombre;
    private ArrayList<Producto> productos;
    private double descuento;

    // Constructor vacío
    public Combo() {

        productos = new ArrayList<>();
        
    }

    // Constructor lleno
    public Combo(int id, String nombre, double descuento) {

        this.id = id;
        this.nombre = nombre;
        this.descuento = descuento;
        this.productos = new ArrayList<>();
    }

    // Agregar un producto al combo
    public void agregarProducto(Producto producto) {

        productos.add(producto);
    }

    // Eliminar un producto del combo
    public void eliminarProducto(Producto producto) {

        productos.remove(producto);
    }

    // Calcular precio aplicando el descuento
    public double calcularPrecioTotal() {

        double total = 0;

        for (Producto producto : productos){
            total += producto.getPrecio();
        }

        total = total - (total * descuento);

        return total;
    }

    @Override
    public int compareTo(Combo otroCombo) {
        return this.nombre.compareToIgnoreCase(otroCombo.nombre);
    }

    @Override
    public String toString() {

        return nombre;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {

        this.productos = productos;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {

        this.descuento = descuento;
    }
}
