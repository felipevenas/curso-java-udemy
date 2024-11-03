public class Main {
    public static void main(String[] args) {

    int a, b;
    double resultado, resultadoCasting;

    a = 5;
    b = 2;

    resultado = a / b;    // Resultado seria '2.5' portanto a operação usa dois números inteiros.
    System.out.println("Resultado sem Casting: " + resultado);

    resultadoCasting = (double) a / b;    // Nesse caso, é utilizado (?) para converter a natureza da operação seguinte.
    System.out.println("Resultado com Casting: " + resultadoCasting);

    }
}