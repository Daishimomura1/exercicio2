import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();

        int length = inputString.length();

        if (length % 2 == 0) {
            // Se o comprimento da string for par
            String primeiraMetade = inputString.substring(0, length / 2);
            System.out.println("A primeira metade da string é: " + primeiraMetade);
        } else {
            // Se o comprimento da string for ímpar
            String primeiraMetade = inputString.substring(0, (length + 1) / 2);
            System.out.println("A primeira metade da string é: " + primeiraMetade);
        }
    }
}