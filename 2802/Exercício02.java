import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        int num = input.nextInt();

        System.out.println("O antecessor de " + num + " é " + (num - 1));
        System.out.println("O sucessor de " + num + " é " + (num + 1));

        input.close();
    }
}
