import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura da pessoa em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino): ");
        String sexo = scanner.next();

        double pesoIdeal;

        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Digite M para masculino ou F para feminino.");
            scanner.close();
            return;
        }

        System.out.println("O peso ideal da pessoa é: " + pesoIdeal + " kg");

        scanner.close();
    }
}
