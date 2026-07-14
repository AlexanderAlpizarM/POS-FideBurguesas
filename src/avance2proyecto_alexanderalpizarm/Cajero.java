package avance2proyecto_alexanderalpizarm;

public class Cajero extends Usuario {

    private static final long serialVersionUID = 1L;

    private boolean activo;

    // Constructor vacío
    public Cajero() {
        super();
    }

    // Constructor lleno
    public Cajero(int id, String nombre, String usuario,String contrasena, boolean activo) {
        super(id, nombre, usuario, contrasena);

        this.activo = activo;
    }

    @Override
    public String tipoUsuario() {

        return "Cajero";
    }

    @Override
    public String toString() {

        return getNombre();
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {

        this.activo = activo;
    }
}
