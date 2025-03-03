
class Estudiante {
    private String nombre;
    private int edad;
    private double calificacion;

    public Estudiante(String nombre, int edad, double calificacion) {
        if (edad < 15 || edad > 80) {
            throw new IllegalArgumentException("La edad debe estar entre 15 y 80 años.");
        }
        if (calificacion < 0 || calificacion > 10) {
            throw new IllegalArgumentException("La calificación debe estar entre 0 y 10.");
        }
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    public boolean aprueba() {
        return calificacion >= 7.5;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Calificación: " + calificacion +
                (aprueba() ? " - Aprobado" : " - Reprobado");
    }
}
