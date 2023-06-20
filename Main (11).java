import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numeroInteiro1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numeroInteiro2 = scanner.nextInt();

        System.out.print("Digite o número real: ");
        double numeroReal = scanner.nextDouble();

        double resultado1 = (numeroInteiro1 * 2) * (numeroInteiro2 / 2);
        double resultado2 = (numeroInteiro1 * 3) + numeroReal;
        double resultado3 = Math.pow(numeroReal, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultado1);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultado2);
        System.out.println("O terceiro elevado ao cubo é: " + resultado3);

        scanner.close();
    }
}
