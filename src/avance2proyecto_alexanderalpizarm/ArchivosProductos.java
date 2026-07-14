package avance2proyecto_alexanderalpizarm;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivosProductos {

    private static final String archivo = "productos.dat";

    // Guarda la colección de productos
    public static void guardarProductos(
            ArrayList<Producto> productos) {

        try {

            FileOutputStream file = new FileOutputStream(archivo);
            ObjectOutputStream salida = new ObjectOutputStream(file);
            salida.writeObject(productos);

            salida.close();
            file.close();

        } catch (Exception e) {

            System.out.println("Error al guardar los productos.");
        }
    }

    // Lee la colección de productos
    public ArrayList<Producto> leerProductos() {
        ArrayList<Producto> productos = new ArrayList<>();

        try {

            FileInputStream file = new FileInputStream(archivo);
            ObjectInputStream entrada = new ObjectInputStream(file);
            productos = (ArrayList<Producto>)entrada.readObject();

            entrada.close();
            file.close();

        } catch (Exception e) {

            // Si el archivo no existe,
            // retorna una colección vacía.
        }
        return productos;
    }
}
