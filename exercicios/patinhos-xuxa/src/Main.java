import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numPatinhos = 5;

        while (numPatinhos > 1) {
            System.out.println(numPatinhos + " patinhos foram passear. \n Além das montanhas. \n Para brincar. \n A mamãe falou: Quá, quá, quá, quá.");
            numPatinhos--;
            System.out.println("Mas só " + numPatinhos + " patinhos voltaram de lá.");
            System.out.println();
        }
        System.out.println(numPatinhos + " patinho foi passear. \n Além das montanhas. \n Para brincar. \n A mamãe falou: Quá, quá, quá, quá. \n Mas nenhum patinho voltou de lá.");

    }
}