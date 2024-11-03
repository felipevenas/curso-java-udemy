import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite as medidas do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        double pX = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

        System.out.println("Digite as medidas do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double pY = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Área maior: X");
        }
        System.out.println("Área maior: Y");


    }
}