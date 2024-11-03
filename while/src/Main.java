import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: \n'0' para finalizar.");
        int x = sc.nextInt();

        int soma = 0;

        while (x != 0) {
            soma = soma + x;
            System.out.println("Digite outro número: \n'0' para finalizar.");
            x = sc.nextInt();
        }

        sc.close();

        System.out.println("Soma dos números: " + soma);

    }
}