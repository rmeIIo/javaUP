import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = input.nextInt();
        }

        for(int i = 4; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        input.close();
    }
}