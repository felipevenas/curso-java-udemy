public class Main {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG   ";

        String s1 = original.toLowerCase();
        // toLowerCase é uma função que transforma os caracteres em caixa baixa.

        System.out.println("Original: " + original);
        System.out.println("To Lower Case: " + s1);

        System.out.println();


        String s2 = original.toUpperCase();
        // toUpperCase é uma função que transforma os caracteres em caixa alta.

        System.out.println("Original: " + original);
        System.out.println("To Upper Case: " + s2);

        System.out.println();


        String s3 = original.trim();
        // Trim é uma função que remove as sobras de caracteres em branco.

        System.out.println("Original: " + original);
        System.out.println("Trim: " + s3);

        System.out.println();

        String s4 = original.substring(2);
        // Substring(x) é uma função que delimita quando um texto começa através das casas.

        System.out.println("Original: " + original);
        System.out.println("Substring: " + s4);

        System.out.println();

        String s5 = original.substring(2, 9);
        // Substring(x, y) é uma função que delimita quando um texto começa e termina através das casas.

        System.out.println("Original: " + original);
        System.out.println("Substring Limitado: " + s5);

        System.out.println();

        String s6 = original.replace('a', 'x');
        // Replace(x, y) é uma função que substitui um(ns) termo(s) por outro(s).

        System.out.println("Original: " + original);
        System.out.println("Replace: " + s6);

        System.out.println();

        String s7 = original.replace("abc", "xy");
        System.out.println("Original: " + original);
        System.out.println("Replace Composto: " + s7);

        System.out.println();

        int j = original.indexOf("bc");
        // LastIndexOx é uma função que imprime a primeira vez que algum termo aparece em um texto.

        System.out.println("Original: " + original);
        System.out.println("IndexOf: " + j);

        System.out.println();

        int i = original.lastIndexOf("bc");
        // LastIndexOx é uma função que imprime a última vez que algum termo aparece em um texto.

        System.out.println("Original: " + original);
        System.out.println("Last IndexOf: " + i);

        System.out.println();

        String nomeCompleto = "Felipe Venas Souza";
        String[] vect = nomeCompleto.split(" ");
        // Split() é uma função que recorta um texto.

        String primeiroNome = vect[0];
        String segundoNome = vect[1];
        String terceirooNome = vect[2];
        System.out.println(primeiroNome);
        System.out.println(segundoNome);
        System.out.println(terceirooNome);

    }
}