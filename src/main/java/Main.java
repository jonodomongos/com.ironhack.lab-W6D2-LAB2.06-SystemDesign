import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
    /*
    INSTRUCCIONES:
	1. Crea un nuevo proyecto Java en tu entorno de desarrollo preferido.
	2. En el proyecto, crea una clase llamada Estudiante que contenga las siguientes propiedades:
	    - nombre: tipo String
        - calificacion: tipo int (en el rango 0–100)
	3.	Crea un Map con una clave del tipo String (el nombre del estudiante) y un valor del tipo Estudiante.
	4.	Crea un método llamado incrementarCalificaciones que reciba como parámetro un Map<String, Estudiante>, aumente la nota de cada estudiante un 10 % y devuelva el mapa actualizado.
	5.	Crea 4 objetos Estudiante (por ejemplo, representando a tus compañeros de clase) y añádelos al Map.
	6.	Crea un diagrama de casos de uso y un diagrama de clases para un sistema de banca en línea.
	    - El sistema debe tener las siguientes características:
	    - Los usuarios pueden transferir fondos, retirar dinero de sus cuentas y depositar dinero.
	    - Los administradores pueden congelar cuentas en caso de fraude.
	    - En el diagrama de clases, utiliza la clase Dinero.
     */
        // 3) Map<String, Estudiante>
        Map<String, Estudiante> estudiantes = new LinkedHashMap<>();

        // 5) 4 estudiantes de ejemplo
        Estudiante e1 = new Estudiante("Ana López", 78);
        Estudiante e2 = new Estudiante("Bruno Díaz", 90);
        Estudiante e3 = new Estudiante("Carla Núñez", 65);
        Estudiante e4 = new Estudiante("Diego Martín", 99);

        estudiantes.put(e1.getNombre(), e1);
        estudiantes.put(e2.getNombre(), e2);
        estudiantes.put(e3.getNombre(), e3);
        estudiantes.put(e4.getNombre(), e4);

        System.out.println("Nota inicial:");
        estudiantes.values().forEach(System.out::println);

        incrementarCalificaciones(estudiantes);

        System.out.println("\nIncremento nota del +10%:");
        estudiantes.values().forEach(System.out::println);
    }

    public static Map<String, Estudiante> incrementarCalificaciones(Map<String, Estudiante> mapa) {
        for (Estudiante e : mapa.values()) {
            int actual = e.getCalificacion();
            int incrementada = (int) Math.round(actual * 1.10);
            if (incrementada > 100) incrementada = 100;
            e.setCalificacion(incrementada);
        }
        return mapa;
    }
}