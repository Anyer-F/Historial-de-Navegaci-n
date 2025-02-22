package historialnavegacion;

import java.util.*;

public class BorrarURLs {
   private Stack<String> historial;

    public BorrarURLs(Stack<String> historial) {
        this.historial = historial;
    }

    // Función para borrar el historial
    public void borrar() {
        historial.clear();
        System.out.println("Historial de navegación borrado.");
    } 
}
