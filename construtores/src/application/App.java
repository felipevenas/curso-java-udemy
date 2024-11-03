package application;

import products.Product;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter product data:");
        System.out.printf("Name: ");
        String name = sc.nextLine();
        System.out.printf("Price: ");
        double value = sc.nextDouble();
        // System.out.printf("Quantity in stock: ");
        // int quantity = sc.nextInt();

        Product product = new Product(name, value); // Dependendo dos parâmetros citados aqui, podemos inciar qualquer um dos dois construtores criados em "Product".

        product.setName("TV Smart LG 32'");
        System.out.println("Updated name: " + product.getName());
        product.setValue(3500.00);
        System.out.println("Updated price: " + product.getValue());

        System.out.println();

        System.out.println("Product data: " + product);

        System.out.println();

        System.out.printf("Enter the number of products to be added to stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();

        System.out.println("Updated data: " + product);

        System.out.println();

        System.out.printf("Enter the number of products to be removed to stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();

        System.out.println("Updated data: " + product);

        sc.close();
    }
}