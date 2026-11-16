
import java.util.Scanner;

public class SumaElementos {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int[] numeros = new int[5];
            int suma = 0;
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingresa el numero " + (i + 1) + ": ");
                numeros[i] = teclado.nextInt();
                
                suma = suma + numeros[i];
            }
            
            System.out.println("La suma total es: " + suma);
        }
    }
}
