package application;

import util.Customer;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Customer customer;

        System.out.print("Insert the number of account: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Insert the holder name of account: ");
        String holder = scanner.nextLine();
        System.out.print("Do you want to realize your first deposit now? (Y/N) ");
        char question = scanner.next().charAt(0);
        if (question == 'Y' || question == 'y') {
            System.out.print("How much money do you will deposit into your account?");
            double firstDeposit = scanner.nextDouble();
            customer = new Customer(holder, number, firstDeposit);
        } else {
            customer = new Customer(holder, number);
        }

        System.out.println();

        System.out.println("Account data:");
        System.out.println(customer);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = scanner.nextDouble();
        customer.Deposit(depositValue);

        System.out.println();

        System.out.println("Updated account data:");
        System.out.println(customer);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scanner.nextDouble();
        customer.Withdraw(withdrawValue);

        System.out.println();

        System.out.println("Updated account data:");
        System.out.println(customer);


    }
}