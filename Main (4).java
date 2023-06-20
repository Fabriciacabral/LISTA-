import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do 1º bimestre: ");
        final double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota do 2º bimestre: ");
        final double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota do 3º bimestre: ");
        final double nota3 = scanner.nextDouble();

        System.out.print("Digite a nota do 4º bimestre: ");
        final double nota4 = scanner.nextDouble();

        final double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média bimestral é: " + media);

        scanner.close();
    }
}


