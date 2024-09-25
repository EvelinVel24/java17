public class Profesor extends Persona {
    public Profesor(String nombre, String fechaNacimiento) {
        super(nombre, fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Profesor: " + nombre + ", Fecha de Nacimiento: " + fechaNacimiento;
    }
}
