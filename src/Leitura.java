import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual é seu filme favorito?");
        String filmeFavorito = leitura.nextLine();

        System.out.println("Qual é o ano de lançamento desse filme?");
        int anoLancamento = leitura.nextInt();

        System.out.println("Qual a nota que você dá para esse filme?");
        double avaliacaoFilme = leitura.nextDouble();

        System.out.printf("""
                    Filme: %s
                    Ano de lançamento: %d
                    Avaliação: %.2f
                """, filmeFavorito, anoLancamento, avaliacaoFilme);
    }

}
