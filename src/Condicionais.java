public class Condicionais {
    public static void main(String[] args) {
        int anoDeLancamento = 2016;
        double media = (9.2 + 6 + 7.5)/3;
        boolean incluiNoPlano = true;
        String tipoDoPlano = "plus";
        if(anoDeLancamento >= 2022){
            System.out.println("Filme lançamento");
        }else {
            System.out.println("Filme não é um lançamento");
        }

        if(incluiNoPlano && tipoDoPlano.equals("plus")){
            System.out.println("Filme incluído no plano");
        }else {
            System.out.println("Filme não é incluído no plano");
        }
    }
}
