import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double num;

        System.out.println("Digite uma sequência de números reais positivos terminada em zero:");

        while ((num = scanner.nextDouble()) != 0) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        double amplitude = max - min;
        System.out.printf("A amplitude estatística dos valores é: %.1f%n", amplitude);

        scanner.close();
    }
}