public class Moto extends Veiculo {

    public Moto(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        super(marca, modelo, anoFabricacao, combustivel, consumoMedio);
    }

    public void acelerar() {
        System.out.println("Carro acelerando...");
    }

    public void frear() {
        System.out.println("Carro freando...");
    }
}
