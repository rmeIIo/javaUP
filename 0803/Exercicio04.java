import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[2][3];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.printf("Informe elemento [%d][%d]: ", i, j);
                matriz[i][j] = input.nextInt();
            }
        }

        int soma = 0;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("A soma dos elementos da matriz é: " + soma);

        input.close();
    }
}