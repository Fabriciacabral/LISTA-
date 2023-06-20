import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double tamanhoArea = scanner.nextDouble();

        double coberturaPorLata = 18.0 * 6.0; // 1 litro para cada 6 metros quadrados
        double coberturaPorGalao = 3.6 * 6.0; // 1 litro para cada 6 metros quadrados
        double folga = 1.10; // 10% de folga
        int latasNecessarias = (int) Math.ceil((tamanhoArea / coberturaPorLata) * folga); // Arredonda para cima
        int galoesNecessarios = (int) Math.ceil((tamanhoArea / coberturaPorGalao) * folga); // Arredonda para cima

        double precoApenasLatas = latasNecessarias * 80.0;
        double precoApenasGaloes = galoesNecessarios * 25.0;

        // Cálculo para misturar latas e galões
        int latasParaMisturar = latasNecessarias;
        int galoesParaMisturar = 0;
        while (latasParaMisturar > 0) {
            double areaRestante = tamanhoArea - (latasParaMisturar * coberturaPorLata);
            galoesParaMisturar = (int) Math.ceil((areaRestante / coberturaPorGalao) * folga);
            if (galoesParaMisturar * 3.6 < 18.0) {
                break; // Não há necessidade de mais latas
            }
            latasParaMisturar--;
        }

        double precoMistura = (latasParaMisturar * 80.0) + (galoesParaMisturar * 25.0);

        System.out.println("Situação 1: Comprar apenas latas de 18 litros");
        System.out.println("Quantidade de latas de tinta: " + latasNecessarias);
        System.out.println("Preço total: R$" + precoApenasLatas);

        System.out.println();

        System.out.println("Situação 2: Comprar apenas galões de 3,6 litros");
        System.out.println("Quantidade de galões de tinta: " + galoesNecessarios);
        System.out.println("Preço total: R$" + precoApenasGaloes);

        System.out.println();

        System.out.println("Situação 3: Misturar latas e galões");
        System.out.println("Quantidade de latas de tinta: " + latasParaMisturar);
        System.out.println("Quantidade de galões de tinta: " + galoesParaMisturar);
        System.out.println("Preço total: R$" + precoMistura);

        scanner.close();
    }
}
