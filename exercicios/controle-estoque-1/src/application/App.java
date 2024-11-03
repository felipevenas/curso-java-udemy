package application;

import products.Product;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Product product = new Product();

        System.out.println("Enter product data:");
        System.out.printf("Name: ");
        product.name = sc.nextLine();
        System.out.printf("Price: ");
        product.value = sc.nextDouble();
        System.out.printf("Quantity in stock: ");
        product.quantity = sc.nextInt();

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