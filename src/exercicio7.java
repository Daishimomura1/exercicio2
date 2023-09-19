    public class espartano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDaSorte = 300000;
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo do Número da Sorte!");

        while (!acertou) {
            System.out.print("Digite o seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite == numeroDaSorte) {
                System.out.println("Parabéns! Você acertou o número da sorte em " + tentativas + " tentativas.");
                acertou = true;
            } else if (palpite < numeroDaSorte) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }

        scanner.close();
    }
}