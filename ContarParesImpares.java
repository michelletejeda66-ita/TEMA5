import java.util.Scanner;

public class ContarParesImpares {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            int[] numeros = new int[10];
            int pares = 0;
            int impares = 0;
            
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingresa el numero " + (i + 1) + ": ");
                numeros[i] = teclado.nextInt();
                
                if (numeros[i] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            
            System.out.println("Numeros pares: " + pares);
            System.out.println("Numeros impares: " + impares);
        }
    }
}