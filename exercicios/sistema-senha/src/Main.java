import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Crie sua senha de 6 dígitos: ");
        int registrarSenha = sc.nextInt();
        System.out.println("Senha cadastrada com sucesso! \nFaça o login agora mesmo.");

        System.out.print("Digite sua senha de 6 dígitos: ");
        int senhaLogin = sc.nextInt();

        if (senhaLogin != registrarSenha) {
            for (int tentativas = 0; tentativas <= 3 || senhaLogin == registrarSenha; tentativas++) {
                System.out.println("Senha inválida! \nTente novamente.");
                senhaLogin = sc.nextInt();
            }
        } else {
            System.out.println("Acesso permitido!");
        }
    }

    // Corrigir!
}