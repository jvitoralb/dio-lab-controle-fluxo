import java.util.Scanner;

public class Contador {
    static Scanner terminal = new Scanner(System.in);
    static int paramUm = 0;
    static int paramDois = 0;

    public static void main(String[] args) {
        try {
            lerParams();
            contar();
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    private static void contar() throws ParametrosInvalidosException {
        if (paramDois < paramUm) {
            throw new ParametrosInvalidosException();
        }

        for(int i = paramUm; i < paramDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    private static void lerParams() {
        System.out.println("Digite o primeiro parâmetro");
        paramUm = terminal.nextInt();
        reiniciarScanner();

        System.out.println("Digite o segundo parâmetro");
        paramDois = terminal.nextInt();
        reiniciarScanner();
    }

    private static void reiniciarScanner() {
        terminal = new Scanner(System.in);
    }
}
