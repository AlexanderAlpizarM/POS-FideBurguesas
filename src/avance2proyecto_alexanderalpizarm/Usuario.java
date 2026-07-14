package avance2proyecto_alexanderalpizarm;
import java.io.Serializable;

public abstract class Usuario implements Serializable, Comparable<Usuario> {

    private static final long serialVersionUID = 1L;

    // Atributos
    private int id;
    private String nombre;
    private String usuario;
    private String contrasena;

    // Constructor vacío
    public Usuario() {
    }

    // Constructor lleno
    public Usuario(int id, String nombre,String usuario, String contrasena) {

        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    // Verifica las credenciales del usuario
    public boolean iniciarSesion(String usuario,String contrasena) {

        return this.usuario.equals(usuario) && this.contrasena.equals(contrasena);
    }

    // Método polimórfico
    public abstract String tipoUsuario();

    @Override
    public int compareTo(Usuario otroUsuario) {

        return this.nombre.compareToIgnoreCase(otroUsuario.nombre);
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {

        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {

        this.contrasena = contrasena;
    }
}
