import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        double mediaAvaliacao = 0;
        double nota = 0;
        Scanner leitura = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Qual é a sua nota para esse filme?");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("A média de notas é "+ mediaAvaliacao/3);
    }
}
