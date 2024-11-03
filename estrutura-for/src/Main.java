import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite a quantidade de vezes que o programa será executado: ");
        int intervaloValores = scanner.nextInt();

        int soma = 0;

        for (int i = 0; i < intervaloValores; i++) {    //* (Início; condição; incremento) { }
            System.out.println("Digite um número: ");   // Início = Executa somente na primeira vez.
            int x = scanner.nextInt();                  // Incremento = Executa toda vez depois de voltar.
            soma = soma + x;
        }

        System.out.println("Soma = " + soma);

    }
}