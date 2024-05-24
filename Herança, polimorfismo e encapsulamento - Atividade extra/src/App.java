import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Veiculo> frota = new ArrayList<Veiculo>();

        Carro carro = new Carro("Vw", "Gol", 2020, 20, 13.3);
        Moto moto = new Moto("Honda", "CG", 2021, 50, 32);

        frota.add(carro);
        frota.add(moto);

        moto.acelerar();
        moto.frear();

        moto.realizarViagem(100);

        System.out.println("Veículos na lista:");
        for(Veiculo veiculo : frota) {
            veiculo.mostrarDetalhes();
        }

        frota.remove(carro);
    }
}
