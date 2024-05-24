public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double combustivel;
    private double consumoMedio;

    public Veiculo(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
        this.consumoMedio = consumoMedio;
    }

    // faça getters e setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public double calcularAutonomia() {
        return combustivel * consumoMedio;
    }

    public boolean precisaAbastecimento() {
        return calcularAutonomia() < 30;
    }

    public void realizarViagem(double distancia) {
        double combustivelNecessario = distancia / consumoMedio;
        if (combustivelNecessario <= combustivel) {
            this.combustivel -= combustivelNecessario;
            System.out.println("Viagem realizada com sucesso! Restaram " + combustivel + " litros de combustivel no veiculo!");
        } else {
            System.out.println("Nao foi possivel realizar a viagem");
        }
    }

    public void mostrarDetalhes() {
        System.out.println("Veiculo: " + marca + " " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de fabricacao: " + anoFabricacao);
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
        System.out.println("Precisa de abastecimento? " + (precisaAbastecimento() ? "Sim" : "Nao"));
    }


}
