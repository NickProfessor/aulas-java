public class Temperatura {
    public static void main(String[] args) {
        double tempCelsius = 32;
        double tempFahrenheit = (tempCelsius * 1.8) + 32;

        System.out.printf("A temperatura %sºC convertida para Fahrenheit resulta em %sºF%n", tempCelsius, tempFahrenheit);
        int tempFInteiro = (int) (tempFahrenheit);
        System.out.printf("A temperatura sem casas decimais ficaria assim %dºF", tempFInteiro);
    }
}
