package avance2proyecto_alexanderalpizarm;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ArchivosUsuarios {

    private static final String archivo = "usuarios.dat";

    // Guarda la colección de usuarios
    public static void guardarUsuarios(
            ArrayList<Usuario> usuarios) {

        try {

            FileOutputStream file = new FileOutputStream(archivo);
            ObjectOutputStream salida = new ObjectOutputStream(file);
            salida.writeObject(usuarios);
            
            salida.close();
            file.close();

        } catch (Exception e) {

            System.out.println("Error al guardar los usuarios.");
        }
    }

    // Lee la colección de usuarios
    public ArrayList<Usuario> leerUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {

            FileInputStream file = new FileInputStream(archivo);
            ObjectInputStream entrada = new ObjectInputStream(file);
            usuarios = (ArrayList<Usuario>)entrada.readObject();

            entrada.close();
            file.close();

        } catch (Exception e) {

            // Si el archivo no existe,
            // retorna una colección vacía.
        }
        return usuarios;
    }

    // Busca un usuario por usuario y contraseña
    public Usuario buscarUsuario(String usuario,String contrasena) {

        ArrayList<Usuario> usuarios = leerUsuarios();
        for (Usuario u : usuarios){
            if (u.iniciarSesion(usuario, contrasena)){
                return u;
            }
        }
        return null;
    }
}
