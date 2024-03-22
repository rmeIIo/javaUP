import java.util.Scanner;

public class Exercício05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a capacidade do tanque (em litros): ");
        double capacidadeTanque = input.nextDouble();

        System.out.print("Digite a quantidade de litros abastecidos: ");
        double litrosAbastecidos = input.nextDouble();

        System.out.print("Digite a quilometragem percorrida desde o último abastecimento: ");
        double quilometragem = input.nextDouble();

        double consumoMedio = quilometragem / litrosAbastecidos;
        double autonomia = consumoMedio * (capacidadeTanque - litrosAbastecidos);

        System.out.printf("O consumo médio do veíuclo é %.2f km/l.\n", consumoMedio);
        System.out.printf("A autonomia do veículo antes do próximo abastecimento é %.2f km.\n", autonomia);

        input.close();
    }
}
