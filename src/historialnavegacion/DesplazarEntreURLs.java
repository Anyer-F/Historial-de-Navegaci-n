package historialnavegacion;

import java.util.Stack;

public class DesplazarEntreURLs {
   private Stack<String> historial;
    private Stack<String> futuro;

    public DesplazarEntreURLs(Stack<String> historial) {
        this.historial = historial;
        this.futuro = new Stack<>();
    }

    // Función para retroceder a la página anterior
    public void retroceder() {
        if (historial.size() > 1) {  // Verificamos que haya más de una URL para retroceder
            String urlActual = historial.pop();
            futuro.push(urlActual);
            System.out.println("Retrocediendo a la página: " + historial.peek());
        } else {
            System.out.println("No hay páginas para retroceder.");
        }
    }

    // Función para avanzar a la página siguiente
    public void avanzar() {
        if (!futuro.isEmpty()) {
            String url = futuro.pop();
            historial.push(url);
            System.out.println("Avanzando a la página: " + url);
        } else {
            System.out.println("No hay páginas para avanzar.");
        }
    } 
   
}
