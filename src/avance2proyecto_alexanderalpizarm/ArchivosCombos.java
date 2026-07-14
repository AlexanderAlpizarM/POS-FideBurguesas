package avance2proyecto_alexanderalpizarm;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivosCombos {

    private static final String archivo = "combos.dat";

    // Guarda la colección de combos en el archivo
    public static void guardarCombos(ArrayList<Combo> combos) {

        try {

            FileOutputStream file = new FileOutputStream(archivo);

            ObjectOutputStream salida = new ObjectOutputStream(file);

            salida.writeObject(combos);

            salida.close();
            file.close();

        } catch (Exception e) {

            System.out.println("Error al guardar los combos.");
        }
    }

    // Lee la colección de combos almacenada
    public ArrayList<Combo> leerCombos() {

        ArrayList<Combo> combos = new ArrayList<>();

        try {

            FileInputStream file = new FileInputStream(archivo);
            ObjectInputStream entrada = new ObjectInputStream(file);
            combos = (ArrayList<Combo>)entrada.readObject();

            entrada.close();
            file.close();

        } catch (Exception e) {

            // Si el archivo no existe,
            // retorna una colección vacía
        }
        return combos;
    }
}
