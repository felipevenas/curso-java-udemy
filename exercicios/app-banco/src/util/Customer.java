package util;

public class Customer {

    private String holder;
    private int number;
    private double balance;

    public Customer(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    public Customer(String holder, int number, double firstDeposit) {
        this.holder = holder;
        this.number = number;
        Deposit(firstDeposit);
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void Deposit(double amount) {
        balance += amount;
    }

    public void Withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
        return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }


}
