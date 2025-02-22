package historialnavegacion;

import java.util.Stack; 

public class MostrarURLs {
   private Stack<String> historial;

    public MostrarURLs(Stack<String> historial) {
        this.historial = historial;
    }

    // Función para mostrar las URLs del historial
    public void mostrar() {
        if (historial.isEmpty()) {
            System.out.println("No hay historial de navegación.");
        } else {
            System.out.println("Historial de navegación:");
            for (String url : historial) {
                System.out.println(url);
            }
        }
    } 
  
}
