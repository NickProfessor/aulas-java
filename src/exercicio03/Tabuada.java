package exercicio03;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um número, estaremos mostrando a tabuada desse número:");
        int numero = leitura.nextInt();
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d \n", numero, i, resultado);
        }
    }
}
