package avance2proyecto_alexanderalpizarm;

public class Administrador extends Usuario {

    private static final long serialVersionUID = 1L;

    // Constructor vacío
    public Administrador() {
        super();
    }

    // Constructor lleno
    public Administrador(int id, String nombre, String usuario, String contrasena) {
        super(id, nombre, usuario, contrasena);
    }

    @Override
    public String tipoUsuario() {

        return "Administrador";
    }

    @Override
    public String toString() {

        return getNombre();
    }
}
