package util;

public class Calculator {

    public static final double PI = 3.14; // Final: Transforma o valor em uma constante, ou seja, não pode ser alterada.

    public static double circumference (double radius) { // Operação estática.
        return 2 * PI * radius;
    }

    public static double volume(double radius) { // Operação estática.
        return 4 * PI * radius * radius * radius / 3;
    }

}
