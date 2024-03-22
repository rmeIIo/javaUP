import java.util.Scanner;;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int soma = 0;
        int numero;

        do {
            System.out.print("Digite um número (ou 0 para terminar): ");
            numero = input.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("A soma dos números fornecidos é: " + soma);

        input.close();
    }
}
