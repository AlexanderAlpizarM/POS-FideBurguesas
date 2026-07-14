package avance2proyecto_alexanderalpizarm;
import java.io.Serializable;
import java.util.Date;

public final class Factura implements Serializable, Comparable<Factura> {

    private static final long serialVersionUID = 1L;

    // Atributos
    private int id;
    private Orden orden;
    private Date fecha;
    private double subtotalSinIva;
    private double impuesto;
    private double total;

    // Constructor vacío
    public Factura() {

        fecha = new Date();
    }

    // Constructor lleno
    public Factura(int id, Orden orden) {

        this.id = id;
        this.orden = orden;
        this.fecha = new Date();

        generarFactura();
    }

    // Calcula los montos de la factura
    public void generarFactura() {

        if (orden == null) {
            subtotalSinIva = 0;
            total = 0;
            impuesto = 0;

            return;
        }

        // El total de la orden ya incluye IVA
        total = orden.calcularTotal();
        subtotalSinIva = total / 1.13;
        impuesto = total - subtotalSinIva;
    }

    // Devuelve el detalle de la factura
    public String mostrarDetalleFactura() {

        String detalle = "";
        detalle += "FACTURA #" + id + "\n";
        detalle += "Cliente: " + orden.getCliente() + "\n";
        detalle += "Fecha: " + fecha + "\n";
        detalle += "------------------------------------\n";

        for (ItemOrden item : orden.getItems()){
            detalle += item.getCantidad() + " x ";
            if (item.esProducto()){
                detalle += item.getProducto().getNombre();
            }
            else if (item.esCombo()){
                detalle += "Combo: "+ item.getCombo().getNombre();
            }

            detalle += " - ₡"+ String.format("%.2f",item.getSubtotal());
            detalle += "\n";
        }

        detalle += "------------------------------------\n";
        detalle += "Subtotal sin IVA: ₡"+ String.format("%.2f",subtotalSinIva)+ "\n";
        detalle += "IVA incluido: ₡"+ String.format("%.2f",impuesto)+ "\n";
        detalle += "Total: ₡"+ String.format("%.2f",total);

        return detalle;
    }

    @Override
    public int compareTo(Factura otraFactura) {

        return Integer.compare(this.id,otraFactura.id);
    }

    @Override
    public String toString() {

        return "Factura #" + id;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {

        this.orden = orden;

        generarFactura();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {

        this.fecha = fecha;
    }

    public double getSubtotalSinIva() {
        return subtotalSinIva;
    }

    public void setSubtotalSinIva(double subtotalSinIva) {

        this.subtotalSinIva = subtotalSinIva;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {

        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {

        this.total = total;
    }
}
