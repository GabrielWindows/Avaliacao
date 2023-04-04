public class ex7 {
    public static void main(String[] args) {
        float media1 = (float) (8.5 + 9.5 + 7) / 3;

        float media2 = (float) (4.5 + 5 + 6.5) / 3;

        float soma = (media1 + media2);

        float mediaFinal = (soma / 2);

        System.out.printf("Primeira média: %.1f \n", media1);
        System.out.printf("Segunda média: %.1f \n", media2);
        System.out.printf("Soma das médias: %.1f \n", soma);
        System.out.printf("Média das médias: %.1f \n", mediaFinal);
    }
}
