package exercicio03;

import java.util.Scanner;

public class ComparacaoNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Vamos comparar dois números! Informe o primeiro número:");
        int numero1 = leitura.nextInt();
        System.out.println("Agora informe o segundo número");
        int numero2 = leitura.nextInt();
        if (numero1 > numero2){
            System.out.printf("O número %d é maior que o %d", numero1, numero2);
        }else if (numero2 > numero1){
            System.out.printf("O número %d é maior que o %d", numero2, numero1);
        }else {
            System.out.println("Os números são iguais");
        }
    }
}
