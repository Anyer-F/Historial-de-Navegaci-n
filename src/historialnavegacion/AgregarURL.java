package historialnavegacion;

import java.util.*;

public class AgregarURL {
    
  private Stack<String> historial;

    public AgregarURL() {
        historial = new Stack<>();
    }

    // Función para agregar una URL al historial
    public void agregar(String url) {
        historial.push(url);
        System.out.println("URL agregada: " + url);
    }

    // Función para obtener el historial
    public Stack<String> getHistorial() {
        return historial;
    }  
}
