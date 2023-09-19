
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();

        String reversedString = reverseString(inputString);

        System.out.println("A string invertida é: " + reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}