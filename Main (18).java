import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivo = scanner.nextDouble();

        System.out.print("Digite a velocidade do link de Internet (em Mbps): ");
        double velocidadeLink = scanner.nextDouble();

        // Conversão de Mbps para MB por minuto
        double velocidadeLinkMB = velocidadeLink / 8.0 / 60.0;

        // Cálculo do tempo aproximado de download em minutos
        double tempoDownloadMinutos = tamanhoArquivo / velocidadeLinkMB;

        System.out.println("Tempo aproximado de download: " + tempoDownloadMinutos + " minutos");

        scanner.close();
    }
}
