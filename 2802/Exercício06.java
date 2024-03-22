import java.util.Scanner;

public class Exercício06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do saque:");
        int valorSaque = scanner.nextInt();

        int notasCem = valorSaque / 100;
        valorSaque %= 100;

        int notasCinquenta = valorSaque / 50;
        valorSaque %= 50;

        int notasVinte = valorSaque / 20;
        valorSaque %= 20;

        int notasDez = valorSaque / 10;
        valorSaque %= 10;

        int notasCinco = valorSaque / 5;
        valorSaque %= 5;

        System.out.println("A menor quantidade de cédulas possível para o saque é:");
        System.out.println("Notas de 100: " + notasCem);
        System.out.println("Notas de 50: " + notasCinquenta);
        System.out.println("Notas de 20: " + notasVinte);
        System.out.println("Notas de 10: " + notasDez);
        System.out.println("Notas de 5: " + notasCinco);

        scanner.close();
    }
}
