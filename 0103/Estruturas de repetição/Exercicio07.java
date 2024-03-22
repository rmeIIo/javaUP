public class Exercicio07 {
    public static void main(String[] args) {
        double soma = 0.0;

        for(int i = 1; i<= 100; i++) {
            soma += (double) i / (101 - i);
        }

        System.out.printf("O resultado da série é: %.2f%n\n", soma);
    }    
}
