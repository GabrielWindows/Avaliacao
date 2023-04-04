import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        float valor = ler.nextFloat();

        System.out.print("Digte o percentual de desconto: ");
        float desconto = ler.nextFloat();

        float valorDesconto = ((valor * desconto) / 100);
        float valorFinal = (valor - valorDesconto);

        System.out.printf("O valor a pagar será: R$ %.2f \n", valorFinal);
        System.out.printf("O valor do desconto foi de: R$ %.2f", valorDesconto);
    }
}
