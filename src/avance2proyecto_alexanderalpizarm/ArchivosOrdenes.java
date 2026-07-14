package avance2proyecto_alexanderalpizarm;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivosOrdenes {

    private static final String archivo = "ordenes.dat";

    // Guarda las órdenes
    public static void guardarOrdenes(
            ArrayList<Orden> ordenes) {

        try {

            FileOutputStream file = new FileOutputStream(archivo);
            ObjectOutputStream salida = new ObjectOutputStream(file);

            salida.writeObject(ordenes);
            salida.close();
            file.close();

        } catch (Exception e) {

            System.out.println("Error al guardar las órdenes.");
        }
    }

    // Lee las órdenes almacenadas
    public ArrayList<Orden> leerOrdenes() {

        ArrayList<Orden> ordenes =
                new ArrayList<>();

        try {

            FileInputStream file = new FileInputStream(archivo);
            ObjectInputStream entrada =  new ObjectInputStream(file);
            ordenes = (ArrayList<Orden>)entrada.readObject();

            entrada.close();
            file.close();

        } catch (Exception e) {

            // Si el archivo no existe,
            // retorna una lista vacía.
        }
        return ordenes;
    }
}
