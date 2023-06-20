import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        double salarioMensal = salarioPorHora * horasTrabalhadas;

        System.out.println("O total do seu salário no mês é: " + salarioMensal);

        scanner.close();
    }
}
