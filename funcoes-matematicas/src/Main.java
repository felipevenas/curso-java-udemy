public class Main {
    public static void main(String[] args) {

        double A, B, C;
        double x = 12;
        double y = 4;
        double z = 9;

        A = Math.sqrt(x);   // Função matemática de Raiz Quadrada.
        B = Math.sqrt(y);
        C = Math.sqrt(z);
        System.out.println("A raiz quadrada de " + x + " é igual a " + A);
        System.out.println("A raiz quadrada de " + y + " é igual a " + B);
        System.out.println("A raiz quadrada de " + z + " é igual a " + C);

        System.out.println();

        A = Math.pow(x, y);     // Função matemática de Potenciação.
        B = Math.pow(y, z);
        C = Math.pow(z, x);
        System.out.println(x + " elevado a " + y + " é igual a " + A);
        System.out.println(y + " elevado a " + z + " é igual a " + B);
        System.out.println(z + " elevado a " + x + " é igual a " + C);

        //  Math.abs(?) > Função matemática de Número Absoluto.


    }
}