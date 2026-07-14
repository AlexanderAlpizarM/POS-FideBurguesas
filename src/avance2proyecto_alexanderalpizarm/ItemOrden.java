package avance2proyecto_alexanderalpizarm;
import java.io.Serializable;

public class ItemOrden implements Serializable {

    private static final long serialVersionUID = 1L;

    // Atributos
    private Producto producto;
    private Combo combo;
    private int cantidad;
    private double subtotal;

    // Constructor vacío
    public ItemOrden() {
    }

    // Constructor para productos
    public ItemOrden(Producto producto, int cantidad) {

        this.producto = producto;
        this.combo = null;
        this.cantidad = cantidad;

        calcularSubtotal();
    }

    // Constructor para combos
    public ItemOrden(Combo combo, int cantidad) {

        this.combo = combo;
        this.producto = null;
        this.cantidad = cantidad;

        calcularSubtotal();
    }

    // Calcula el subtotal del producto o combo
    public double calcularSubtotal() {

        if (producto != null){
            subtotal = producto.getPrecio() * cantidad;

        } 
        else if (combo != null){
            subtotal = combo.calcularPrecioTotal() * cantidad;
            
        } 
        else {
            subtotal = 0;
        }
        return subtotal;
    }

    // Indica si el item contiene un producto
    public boolean esProducto() {

        return producto != null;
    }

    // Indica si el item contiene un combo
    public boolean esCombo() {

        return combo != null;
    }

    // Getters y setters

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {

        this.producto = producto;
        this.combo = null;

        calcularSubtotal();
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {

        this.combo = combo;
        this.producto = null;

        calcularSubtotal();
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {

        this.cantidad = cantidad;

        calcularSubtotal();
    }

    public double getSubtotal() {
        return subtotal;
    }
}
