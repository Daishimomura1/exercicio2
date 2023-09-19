import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 's';

        do {
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1. adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");

            int escolha = scanner.nextInt();
            double resultado = 0;

            switch (escolha) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    } else {
                        System.out.println("Erro: divisão por zero");
                        continuar = 's'; // Continuar no loop para nova entrada válida
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operação inválida");
                    continuar = 's'; // Continuar no loop para nova entrada válida
                    continue;
            }

            System.out.println("Resultado: " + resultado);

            System.out.println("Deseja continuar? (s/n)");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Calculadora encerrada.");
    }
}