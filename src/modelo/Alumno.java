public class Alumno extends Persona {
    private int tareasPendientes;

    public Alumno(String nombre, String fechaNacimiento, int tareasPendientes) {
        super(nombre, fechaNacimiento);
        this.tareasPendientes = tareasPendientes;
    }

    public int getTareasPendientes() {
        return tareasPendientes;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + ", Fecha de Nacimiento: " + fechaNacimiento + ", Tareas Pendientes: " + tareasPendientes;
    }
}
