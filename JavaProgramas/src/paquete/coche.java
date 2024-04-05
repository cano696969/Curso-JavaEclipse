import java.util.Scanner;
package paquete;


public class coche {
	private boolean estado;

    public void encender() {
        if (estado == false) {
            System.out.println("El coche se ha encendido");
            estado = true;
        } else {
            System.out.println("El coche ya está encendido");
        }
    }


    public void apagar() {
        if (estado == true) {
            System.out.println("El coche se ha apagado");
            estado = false;
        } else {
            System.out.println("El coche ya está apagado");
        }
    }

 
    public void avanzar() {
        if (estado == true) {
            System.out.println("El coche está avanzando");
        } else {
            System.out.println("El coche no puede avanzar");
        }
    }

    public static void main(String[] args) {

        Coche miCoche = new Coche();
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Menú de opciones
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Encender coche");
            System.out.println("2. Apagar coche");
            System.out.println("3. Avanzar coche");
            System.out.println("4. Salir");

            // Leer la opción del usuario
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            // Realizar la acción correspondiente según la opción seleccionada
            switch (opcion) {
                case 1:
                    miCoche.encender();
                    break;
                case 2:
                    miCoche.apagar();
                    break;
                case 3:
                    miCoche.avanzar();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 4);

        // Cerrar el Scanner
        scanner.close();
    }
}
