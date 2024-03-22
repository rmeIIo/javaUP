public class Exercicio02 {
    public static void main(String[] args) {
        int vetor[] = {1, 2, 3, 4, 5}, soma, i;

        soma = 0;

        for(i = 0; i < 5; i++) {
            soma += vetor[i];
        }

        float media = soma / 5;

        System.out.println("A média é: " + media);

        System.out.print("Valores iguais ou superiores a media: ");

        for(i = 0; i < 5; i++) {
            if(vetor[i] >= media) {
                System.out.print(vetor[i] + " ");
            }
        }
    }
}
