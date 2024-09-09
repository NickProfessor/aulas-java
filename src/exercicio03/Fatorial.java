package exercicio03;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um número e calcularemos seu fatorial:");
        int numero = leitura.nextInt();
        int fatorial = 1;
        for (int i = numero; i > 0; i--) {
            if (i != 1){
                System.out.printf("%d * ", i);
            }else {
                System.out.printf("%d", i);
            }
            fatorial *= i;
        }
        System.out.printf("\n= %d", fatorial);
    }
}
