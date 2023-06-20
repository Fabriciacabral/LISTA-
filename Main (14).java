import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso de peixes em quilos: ");
        double peso = scanner.nextDouble();

        double limite = 50.0;
        double excesso = 0.0;
        double multa = 0.0;

        if (peso > limite) {
            excesso = peso - limite;
            multa = excesso * 4.0;
        }

        System.out.println("Peso de peixes: " + peso + " kg");
        System.out.println("Limite de peso: " + limite + " kg");

        if (excesso > 0.0) {
            System.out.println("Excesso de peso: " + excesso + " kg");
            System.out.println("Valor da multa a ser pago: R$" + multa);
        } else {
            System.out.println("Não há excesso de peso. Sem multa a ser paga.");
        }

        scanner.close();
    }
}
