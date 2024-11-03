import util.CurrencyConverter;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("What is the dollar price? ");
        double dollarPrice = scanner.nextDouble();

        System.out.println("How many dollar will be bought? ");
        double dollarQuantity = scanner.nextDouble();

        double converter = CurrencyConverter.Converter(dollarQuantity, dollarPrice);

        System.out.printf("Amount to be paid in reais = R$%.2f%n", converter);
    }
}