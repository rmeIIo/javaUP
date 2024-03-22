import java.util.Scanner;

public class Exercicio04 {
    private String nome;
    private double preco;

    public Exercicio04(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void imprimirPrecoComDesconto() {
        double desconto = preco * 0.10;
        double novoPreco = preco - desconto;
        System.out.println("Você comprou um produto (" + nome + ") por R$" + preco + " e acaba de ganhar um desconto de 10%. Assim você vai pagar apenas R$" + novoPreco + " pelo seu produto. Volte sempre!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: R$");
        double preco = scanner.nextDouble();
        Exercicio04 produto = new Exercicio04(nome, preco);
        produto.imprimirPrecoComDesconto();

        scanner.close();
    }
}
