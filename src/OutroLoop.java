import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        double mediaAvaliacao = 0;
        double nota = 0;
        int numeroDeNotas = 0;
        Scanner leitura = new Scanner(System.in);
        while (nota != -1) {
            System.out.println("Qual é a sua nota para esse filme? DIGITE -1 PARA ENCERRAR");
            nota = leitura.nextDouble();
            if (nota != -1){
            mediaAvaliacao += nota;
            numeroDeNotas++;
            }
        }

        System.out.println("A média de notas é "+ mediaAvaliacao/numeroDeNotas);
    }
}
