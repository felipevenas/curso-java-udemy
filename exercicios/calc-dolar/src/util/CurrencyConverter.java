package util;

public class CurrencyConverter {

    public static final double IOF = 6.0;

    public static double Converter(double dollarQuantity, double dollarPrice) {
        double total = dollarPrice * dollarQuantity;
        double addTax = (total * IOF) / 100; // +6% de taxas.
        return total + addTax;
    }
}
