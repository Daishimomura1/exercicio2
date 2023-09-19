import java.util.Scanner;

public class exercicio1 {
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor mínimo do intervalo: ");
        int min = input.nextInt();

        System.out.print("Informe o valor máximo do intervalo: ");
        int max = input.nextInt();

        System.out.println("Números primos no intervalo de " + min + " a " + max + ":");

        for (int i = min; i <= max; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}