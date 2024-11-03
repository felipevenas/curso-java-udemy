import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite três números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int maior = maiorNum(n1, n2, n3);

        mostrarResultado(maior);

        sc.close();
    }

    public static int maiorNum(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void mostrarResultado(int resultado) {
        System.out.println("O maior valor é: " + resultado);
    }


}
