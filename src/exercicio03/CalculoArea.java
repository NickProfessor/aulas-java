package exercicio03;

import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 1 && opcao != 2) {
            System.out.println("""
                        Escolha uma das opções:
                        1 - Calcular área do quadrado
                        2 - Calcular área do círculo
                    """);
        opcao = leitura.nextInt();
        }
        if (opcao == 1){
            System.out.println("Vamos calcular a área do quadrado! Informe um lado do quadrado em cm");
            double ladoQuadrado = leitura.nextDouble();
            double areaQuadrado = ladoQuadrado * ladoQuadrado;
            System.out.printf("A área desse quadrado é de %.2f cm", areaQuadrado);
        }else{
            System.out.println("Vamos calcular a área do círculo! Informe o raio do círculo em cm");
            double raioCirculo = leitura.nextDouble();
            double areaCirculo = Math.PI * Math.pow(raioCirculo,2);
            System.out.printf("A área desse círculo é de %.2f cm", areaCirculo);
        }
    }
}
