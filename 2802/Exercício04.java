import java.util.Scanner;

public class Exercício04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de km percorridos pelo carro alugado: ");
        double kmPercorridos = input.nextDouble();

        System.out.print("Digite a quantidade de dias pelos quais o carro foi alugado: ");
        int diasAlugados = input.nextInt();

        double valorAPagar = diasAlugados * 70 + kmPercorridos * 0.15;

        System.out.printf("O valor a pagar é: R$%.2f\n", valorAPagar);

        input.close();
    }
}
