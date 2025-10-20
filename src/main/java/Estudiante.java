public class Estudiante {
    private String nombre;
    private int calificacion; // 0..100

    public Estudiante(String nombre, int calificacion) {
        this.nombre = nombre;
        setCalificacion(calificacion);
    }

    public String getNombre() { return nombre; }
    public int getCalificacion() { return calificacion; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setCalificacion(int calificacion) {
        if (calificacion < 0 || calificacion > 100) {
            throw new IllegalArgumentException("La calificación debe estar entre 0 y 100.");
        }
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return nombre + " -> " + calificacion;
    }
}