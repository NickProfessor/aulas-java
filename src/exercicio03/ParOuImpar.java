package exercicio03;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um número e diremos se ele é par ou ímpar:");
        int numero = leitura.nextInt();
        if(numero % 2 == 0){
            System.out.println("Esse número é par");
        }else{
            System.out.println("Esse número é ímpar");
        }
    }
}
