package avance2proyecto_alexanderalpizarm;
import java.io.Serializable;
import javax.swing.JOptionPane;

public class Producto implements Serializable, Comparable<Producto> {

    private static final long serialVersionUID = 1L;

    // Atributos
    private int id;
    private String nombre;
    private double precio;
    private String categoria;

    // Constructor vacío
    public Producto() {
    }

    // Constructor lleno
    public Producto(int id, String nombre,double precio, String categoria) {

        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    // Métodos

    public void registrarProducto() {

        JOptionPane.showMessageDialog(null,"Producto registrado correctamente.");
    }

    public void modificarProducto() {
        JOptionPane.showMessageDialog(null,"Producto modificado correctamente.");
    }

    public void eliminarProducto() {

        JOptionPane.showMessageDialog(null,"Producto eliminado correctamente.");
    }

    @Override
    public int compareTo(Producto otroProducto) {

        return this.nombre.compareToIgnoreCase(otroProducto.nombre);
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {

        this.categoria = categoria;
    }
}
