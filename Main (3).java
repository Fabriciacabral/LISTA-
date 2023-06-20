import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner dois =new Scanner(System.in);
    System.out.println("Informe o primeiro número: ");
    float n1 =dois.nextFloat();
    System.out.println("Informe o segundo número: ");
    float n2 =dois.nextFloat();

    float resu =n1+n2;
    System.out.println("A soma é: "+resu);
  }
}