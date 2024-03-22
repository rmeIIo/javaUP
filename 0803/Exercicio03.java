import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vetor[] = {1, 2, 3, 4, 5}, num;
        boolean encontrado = false;

        System.out.print("Digite um número: ");
        num = input.nextInt();

        for(int i = 1; i < 5; i++) {
            if(vetor[i] == num) {
                System.out.print("Elemento encontrado no índice: " + i);
                encontrado = true;
                break;
            }
        }

        if(encontrado == false) {
            System.out.println("Elemento não encontrado!");
        }


        input.close();
    }
}
