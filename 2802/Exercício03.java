import java.util.Scanner;

public class Exercício03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de latas de 350ml compradas: ");
        int latas = input.nextInt();

        System.out.print("Digite a quantidade de garrafas de 600ml compradas: ");
        int garrafas = input.nextInt();

        System.out.print("Digite a quantidade de garrafas de 2 litros compradas: ");
        int garrafas2Litros = input.nextInt();

        double totalLitros = latas * 0.35 + garrafas + 0.6 + garrafas2Litros * 2;

        System.out.printf("O comerciante comprou um total de %.2f litros de refrigerante. \n", totalLitros);

        input.close();
    }
}
