public class Main {
    public static String nome = "Nickollas";

    public static void main(String[] args) {
        System.out.println("Olá, "+ nome);
        System.out.println("Tudo bem, "+ nome +"?");
        System.out.println("Filme: Zootopia");
        int anoDeLancamento = 2016;
        System.out.println("Ano de lançamento: "+ anoDeLancamento);
        double media = (9.2 + 6 + 7.5)/3;
        System.out.println("""
                    O filme Zootopia
                    Lançado em 2016
                    Conta com uma nota de
                """+ media);
        int classificacao = (int) (media/2);
        System.out.println(classificacao);
    }


}