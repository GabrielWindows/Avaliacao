import java.util.Scanner;
public class ex9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite uma temperatura em graus Celsius: ");
        float C = ler.nextInt();

        double F = (C * 1.8 + 32);

        System.out.printf("%.0f graus celsius = %.2f graus Fahrenheit", C, F);
    }
}
