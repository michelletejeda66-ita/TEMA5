
import java.util.Scanner;

public class NumeroMayorMenor {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int[] numeros = new int[8];
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingresa el numero " + (i + 1) + ": ");
                numeros[i] = teclado.nextInt();
            }
            
            int mayor = numeros[0];
            int menor = numeros[0];
            
            for (int i = 1; i < numeros.length; i++) {
                
                if (numeros[i] > mayor) {
                    mayor = numeros[i];
                }
                
                if (numeros[i] < menor) {
                    menor = numeros[i];
                }
            }
            
            System.out.println("El numero mayor es: " + mayor);
            System.out.println("El numero menor es: " + menor);
        }
    }
}

