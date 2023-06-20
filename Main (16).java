import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double tamanhoArea = scanner.nextDouble();

        double coberturaPorLata = 18.0 * 3.0; // 1 litro para cada 3 metros quadrados
        int latasNecessarias = (int) Math.ceil(tamanhoArea / coberturaPorLata); // Arredonda para cima
        double precoTotal = latasNecessarias * 80.0;

        System.out.println("Quantidade de latas de tinta a serem compradas: " + latasNecessarias);
        System.out.println("Preço total: R$" + precoTotal);

        scanner.close();
    }
}
