import java.util.Scanner;

public class InvertirElementos {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int[] numeros = new int[6];
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingresa el numero " + (i + 1) + ": ");
                numeros[i] = teclado.nextInt();
            }
            
            System.out.println("Arreglo en orden inverso:");
            
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
            }
            
            System.out.println();
        }
    }
}