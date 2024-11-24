package libjniSecante;

/**
 * Clase que representa las funciones de la biblioteca dinámica JNI para la secante.
 */
public class JavaSecante {

    // Método nativo para ejecutar el cálculo del método de la secante
    public native void ejecutarSecante(int opcion, double x0, double x1, int maxIter, double tol);

    // Constructor para cargar la biblioteca dinámica
    public JavaSecante() {
        try {
            System.loadLibrary("Secante"); // Asegúrate de que el nombre coincida con tu biblioteca nativa
            System.out.println("Biblioteca cargada exitosamente!");
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Carga de la biblioteca fallida: " + e.getMessage());
        }
    }

    // Método principal para probar la funcionalidad
    public static void main(String[] args) {
        JavaSecante secante = new JavaSecante();

        // Configuración de parámetros para el método de la secante
        int opcion = 1; // Opción para seleccionar la función en la biblioteca nativa
        double x0 = 1.0; // Primer valor inicial
        double x1 = 2.0; // Segundo valor inicial
        int maxIter = 100; // Máximo número de iteraciones
        double tol = 1e-6; // Tolerancia

        // Ejecución del método de la secante
        System.out.println("Ejecutando el método de la secante...");
        secante.ejecutarSecante(opcion, x0, x1, maxIter, tol);
    }
}





