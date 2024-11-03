import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String sexo = "";
        String etnia = "";

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Sexo: ");
        System.out.println("1. Masculino | 2. Feminino");
        int sexoId = scanner.nextInt();
            if (sexoId == 1) {      // Estrutura condicional simples.
                sexo = "Masculino";
            } else {
                sexo = "Feminino";
            }

        System.out.println("Etnia: ");
        System.out.println("1. Negro | 2. Pardo | 3. Branco");
        int etniaId = scanner.nextInt();
            if (etniaId == 1) {     // Estrutura condicional composta.
                etnia = "Negro";
            } else {
                if (etniaId == 2) {
                    etnia = "Pardo";
                } else {
                    etnia = "Branco";
                }
            }

        System.out.println("Digite sua renda mensal: ");
        double rendaMensal = scanner.nextDouble();

        scanner.close();    // Finaliza o Scanner.

        System.out.println("======== RESULTADO FINAL ========");
        System.out.println("NOME COMPLETO: " + nomeCompleto);
        System.out.println("IDADE: " + idade);
        System.out.println("SEXO: " + sexo);
        System.out.println("ETNIA: " + etnia);
        System.out.printf("RENDA MENSAL: R$ %.2f%n", rendaMensal);      // Função para determinar quantidade de casas decimais.
            if (idade >= 18 && etniaId <= 2 && rendaMensal <= 3000) {
                System.out.println("        RESULTADO FINAL: APROVADO");
            } else {
                System.out.println("        RESULTADO FINAL: REPROVADO");
            }

    }
}