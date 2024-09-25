public class Main {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar al menos 4 individuos
        Persona[] individuos = new Persona[4];

        // Crear objetos Profesor y Alumno
        Profesor profesor1 = new Profesor("Juan Pérez", "15/03/1975");
        Alumno alumno1 = new Alumno("Ana González", "20/09/2000", 3);
        Alumno alumno2 = new Alumno("Luis Ramírez", "12/12/1999", 1);
        Alumno alumno3 = new Alumno("Marta López", "02/06/2001", 5);

        // Almacenar los objetos en el arreglo
        individuos[0] = profesor1;
        individuos[1] = alumno1;
        individuos[2] = alumno2;
        individuos[3] = alumno3;

        // Punto 3: Imprimir si es alumno o profesor y el nombre del individuo
        for (Persona persona : individuos) {
            if (persona instanceof Profesor) {
                System.out.println("Es un profesor: " + persona.getNombre());
            } else if (persona instanceof Alumno) {
                System.out.println("Es un alumno: " + persona.getNombre());
            }
        }

        // Punto 4: Imprimir la super clase correspondiente a cada uno
        for (Persona persona : individuos) {
            System.out.println("La superclase de " + persona.getNombre() + " es " + persona.getClass().getSuperclass().getName());
        }

        // Punto 5: Imprimir la lista completa de individuos
        System.out.println("\nLista completa de individuos:");
        for (Persona persona : individuos) {
            System.out.println(persona);
        }
    }
}
