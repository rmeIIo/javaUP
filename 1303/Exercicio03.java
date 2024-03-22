class ContaEnergia {
    private double kwConsumidos;
    private String tipoCliente;

    public ContaEnergia(double kwConsumidos, String tipoCliente) {
        this.kwConsumidos = kwConsumidos;
        this.tipoCliente = tipoCliente;
    }

    public double calcularValorConta() {
        double valorKw;
        switch(tipoCliente) {
            case "pessoa física":
                valorKw = 0.60;
                break;
            case "comércio":
                valorKw = 0.48;
                break;
            case "indústria":
                valorKw = 1.29;
                break;
            default:
                valorKw = 0.00;
        }

        return kwConsumidos * valorKw;
    }
}

public class Exercicio03 {
    public static void main(String[] args) {
        ContaEnergia conta = new ContaEnergia(100, "comércio");
        double valorConta = conta.calcularValorConta();
        System.out.println("O valor da conta de energia é R$" + valorConta);
    }
}
