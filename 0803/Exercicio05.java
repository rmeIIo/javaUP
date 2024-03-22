public class Exercicio05 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};

        int menor = matriz[0][0];
        int maior = matriz[0][0];
        int soma = 0;

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }

                if(matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

                soma += matriz[i][j];
            }
        }

        float media = soma / 25;

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
    }
}
