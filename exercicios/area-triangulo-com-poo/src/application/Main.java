package application;

import entities.Triangule;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangule x, y; // Declarando variáveis no tipo 'Triangule'.
        x = new Triangule(); // Instanciando, criando o objeto.
        y = new Triangule();

        System.out.println("Digite as medidas do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.calcArea(); // Reaproveitamento do código. Usando o mesmo método apenas substituindo o objeto chamado.
        double areaY = y.calcArea();

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Área maior: X");
        }
        System.out.println("Área maior: Y");

    }
}

