
import java.util.Scanner;

public class OrdenamientoBurbuja {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int cantidad;
            
            System.out.println("================================");
            System.out.println("     ORDENAMIENTO BURBUJA");
            System.out.println("================================");
            
            // Solicitar la cantidad de elementos
            System.out.print("Ingresa la cantidad de numeros: ");
            cantidad = entrada.nextInt();
            
            // Validar la cantidad
            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor a cero.");
                return;
            }
            
            // Crear el arreglo dinamico
            int[] numeros = new int[cantidad];
            
            // Llenar el arreglo
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Ingresa el numero " + (i + 1) + ": ");
                numeros[i] = entrada.nextInt();
            }
            
            // Mostrar arreglo original
            System.out.println("\nArreglo original:");
            
            for (int i = 0; i < cantidad; i++) {
                System.out.print(numeros[i] + " ");
            }
            
            // Metodo de ordenamiento burbuja
            for (int i = 0; i < cantidad - 1; i++) {
                
                for (int j = 0; j < cantidad - 1 - i; j++) {
                    
                    if (numeros[j] > numeros[j + 1]) {
                        
                        int auxiliar = numeros[j];
                        
                        numeros[j] = numeros[j + 1];
                        
                        numeros[j + 1] = auxiliar;
                    }
                }
            }
            
            // Mostrar arreglo ordenado
            System.out.println("\n\nArreglo ordenado de forma ascendente:");
            
            for (int i = 0; i < cantidad; i++) {
                System.out.print(numeros[i] + " ");
            }
            
            System.out.println("\n================================");
            System.out.println("       PROGRAMA FINALIZADO");
            System.out.println("================================");
        }
    }
}
