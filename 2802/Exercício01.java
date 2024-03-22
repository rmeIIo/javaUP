import java.util.Scanner;

class Exercício01 {
    public static void main(String[] args) throws java.io.IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int horas = input.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = input.nextInt();

        System.out.print("Digite os segundos: ");
        int segundos = input.nextInt();

        int totalSegundos = horas * 3600 + minutos * 60 + segundos;

        System.out.printf("Total de segundos: %d", totalSegundos);
        System.out.println();

        input.close();
    }    
}
