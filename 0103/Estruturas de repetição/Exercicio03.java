import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        int contador = 0;

        for(int i = 1; i <= numero; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
                contador++;
            }
        }

        System.out.println("Quantidade de números pares apresentados: " + contador);
        input.close();
    }
}
