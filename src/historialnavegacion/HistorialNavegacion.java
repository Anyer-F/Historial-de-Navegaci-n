package historialnavegacion;

import java.util.Stack;
import java.util.Scanner;

public class HistorialNavegacion {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Stack<String> historial = new Stack<>();
        AgregarURL agregarURL = new AgregarURL();
        DesplazarEntreURLs desplazarse = new DesplazarEntreURLs(historial);
        MostrarURLs mostrarURLs = new MostrarURLs(historial);
        BorrarURLs borrarURL = new BorrarURLs(historial);

        int opcion;
        do {
            System.out.println("1. Visitar nueva página");
            System.out.println("2. Retroceder página");
            System.out.println("3. Avanzar página");
            System.out.println("4. Mostrar historial");
            System.out.println("5. Borrar historial");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese URL: ");
                    String url = scanner.nextLine();
                    agregarURL.agregar(url);
                    break;
                case 2:
                    desplazarse.retroceder();
                    break;
                case 3:
                    desplazarse.avanzar();  // Ahora el método de avanzar está habilitado de nuevo
                    break;
                case 4:
                    mostrarURLs.mostrar();
                    break;
                case 5:
                    borrarURL.borrar();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 6);

        scanner.close(); 
    }
          
}
