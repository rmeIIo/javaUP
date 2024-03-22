import java.util.Scanner;

class BombaCombustivel {
    private int numeroBomba;
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(int numeroBomba, String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.numeroBomba = numeroBomba;
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public double abastecerPorValor(double valor) {
        double litrosAbastecidos = valor / this.valorLitro;
        this.quantidadeCombustivel -= litrosAbastecidos;
        return litrosAbastecidos;
    }

    public double abastecerPorLitro(double litros) {
        double valorPago = litros * this.valorLitro;
        this.quantidadeCombustivel -= litros;
        return valorPago;
    }

    public void alterarValor(double novoValor) {
        this.valorLitro = novoValor;
    }

    public void alterarQuantidadeCombustivel(double novaQuantidade) {
        this.quantidadeCombustivel = novaQuantidade;
    }

    public void status() {
        System.out.println("Número da bomba: " + this.numeroBomba);
        System.out.println("Tipo de combustível: " + this.tipoCombustivel);
        System.out.println("Valor por litro: " + this.valorLitro);
        System.out.println("Quantidade de combustível: " + this.quantidadeCombustivel);
    }
}


public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BombaCombustivel bomba = new BombaCombustivel(1, "Gasolina", 5.30, 1000);
        System.out.println("Informe o valor a ser abastecido: ");
        double valorAbastecido = scanner.nextDouble();
        double litros = bomba.abastecerPorValor(valorAbastecido);
        System.out.println("Foram abastecidos " + litros + " litros.");

        scanner.close();
    }
}
