package exercicio01;

public class Palavras {
    public static void main(String[] args) {
        char artigo = 'A';
        String frase = "vida é uma maravilha";
        String mensagem = String.format("%c %s!",artigo,frase);
        System.out.println(mensagem);

    }
}
