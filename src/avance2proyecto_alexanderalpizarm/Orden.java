package avance2proyecto_alexanderalpizarm;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Orden implements Serializable, Comparable<Orden> {

    private static final long serialVersionUID = 1L;

    // Atributos
    private int id;
    private Date fecha;
    private String cliente;
    private ArrayList<ItemOrden> items;

    // Estado del pago
    private String estado;

    // Estado de cocina
    private String estadoCocina;

    // Constructor vacío
    public Orden() {

        fecha = new Date();
        items = new ArrayList<>();

        estado = "No pagada";
        estadoCocina = "Pendiente";
    }

    // Constructor lleno
    public Orden(int id, String cliente) {

        this.id = id;
        this.cliente = cliente;
        this.fecha = new Date();
        this.items = new ArrayList<>();

        this.estado = "No pagada";
        this.estadoCocina = "Pendiente";
    }

    // Métodos

    public void agregarItem(ItemOrden item) {

        items.add(item);
    }

    public void eliminarItem(ItemOrden item) {

        items.remove(item);
    }

    public double calcularTotal() {

        double total = 0;

        for (ItemOrden item : items){
            total += item.calcularSubtotal();
        }

        return total;
    }

    public void cambiarEstado(String estado) {

        this.estado = estado;
    }

    public void cambiarEstadoCocina(String estadoCocina) {

        this.estadoCocina = estadoCocina;
    }

    public String mostrarDetalleOrden() {

        String detalle = "";

        detalle += "Orden #" + id + "\n";
        detalle += "Cliente: " + cliente + "\n";
        detalle += "Estado de pago: " + estado + "\n";
        detalle += "Estado de cocina: " + estadoCocina + "\n\n";

        for (ItemOrden item : items){
            detalle += item.getCantidad() + " x ";
            if (item.esProducto()){
                detalle += item.getProducto().getNombre();

            } 
            else if (item.esCombo()){

                detalle += "Combo: "+ item.getCombo().getNombre();
            }

            detalle += " - ₡"+ String.format("%.2f",item.calcularSubtotal());
            detalle += "\n";
        }

        double total = calcularTotal();
        double subtotalSinIva = total / 1.13;
        double iva = total - subtotalSinIva;

        detalle += "\n---------------------------------\n";

        detalle += "Subtotal sin IVA: ₡"+ String.format("%.2f", subtotalSinIva)+ "\n";
        detalle += "IVA incluido: ₡"+ String.format("%.2f", iva)+ "\n";
        detalle += "TOTAL: ₡"+ String.format("%.2f", total);

        return detalle;
    }

    @Override
    public int compareTo(Orden otraOrden) {

        return Integer.compare(this.id,otraOrden.id);
    }

    @Override
    public String toString() {

        return "Orden #" + id;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {

        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {

        this.cliente = cliente;
    }

    public ArrayList<ItemOrden> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemOrden> items) {

        this.items = items;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {

        this.estado = estado;
    }

    public String getEstadoCocina() {
        return estadoCocina;
    }

    public void setEstadoCocina(String estadoCocina) {

        this.estadoCocina = estadoCocina;
    }
}
