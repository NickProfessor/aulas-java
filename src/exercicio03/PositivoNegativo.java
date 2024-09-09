package exercicio03;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um número inteiro e diremos se ele é positivo ou negativo");
        int numero = leitura.nextInt();
        if(numero > 0){
            System.out.println("Esse número é positivo");
        }else if(numero < 0){
            System.out.println("Esse número é negativo");
        }else{
            System.out.println("Você informou o número zero");
        }
    }
}
