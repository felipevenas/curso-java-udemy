import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = Calculator.circumference(radius); // Não é preciso instanciar um objeto para classes estáticas.

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        scanner.close();

    }
}