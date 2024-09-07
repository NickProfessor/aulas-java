package exercicio02;

public class Conversao {
    public static void main(String[] args) {
        double valorEmDolares = 10.50;
        double valorEmReais = valorEmDolares * 4.94;
        String mensagem = String.format("O valor convertido em reais é igual a R$%.2f", valorEmReais);
        System.out.println(mensagem);
    }
}
