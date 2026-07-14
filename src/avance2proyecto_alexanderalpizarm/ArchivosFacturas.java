package avance2proyecto_alexanderalpizarm;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivosFacturas {

    private static final String archivo = "facturas.dat";

    // Guarda la colección de facturas
    public static void guardarFacturas(
            ArrayList<Factura> facturas) {

        try {

            FileOutputStream file = new FileOutputStream(archivo);
            ObjectOutputStream salida = new ObjectOutputStream(file);
            salida.writeObject(facturas);

            salida.close();
            file.close();

        } catch (Exception e) {

            System.out.println("Error al guardar las facturas.");
        }
    }

    // Lee la colección de facturas
    public ArrayList<Factura> leerFacturas() {

        ArrayList<Factura> facturas = new ArrayList<>();

        try {

            FileInputStream file = new FileInputStream(archivo);

            ObjectInputStream entrada = new ObjectInputStream(file);

            facturas = (ArrayList<Factura>)entrada.readObject();

            entrada.close();
            file.close();

        } catch (Exception e) {

            // Si el archivo no existe,
            // retorna una colección vacía
        }
        return facturas;
    }
}
