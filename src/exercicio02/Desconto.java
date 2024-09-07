package exercicio02;

public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 100;
        double percentualDeDesconto  = 0.1;
        double precoComDesconto = precoOriginal - (precoOriginal * percentualDeDesconto);
        String mensagem = String.format("O preço com desconto é igual a R$%.2f", precoComDesconto);
        System.out.println(mensagem);
    }
}
