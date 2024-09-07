package exercicio02;

public class Preco {
    public static void main(String[] args) {
        double precoProduto = 55.90;
        int quantidade = 10;
        double valorTotal = precoProduto * quantidade;
        String mensagem = String.format("O valor total da compra é R$%.2f", valorTotal);
        System.out.println(mensagem);
    }
}
