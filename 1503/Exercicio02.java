import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer() {
        idade++;
        if (idade < 21) {
            altura++;
        }

        System.out.println(nome + " agora tem " + idade + " anos e " + altura + " cm de altura.");
    }

    public void engordar(double quilos) {
        peso += quilos;
        System.out.println(nome + " agora pesa " + peso + " kg.");
    }

    public void emagrecer(double quilos) {
        peso -= quilos;
        System.out.println(nome + " agora pesa " + peso + " kg.");
    }
}

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();

        System.out.println("Digite o peso da pessoa (em kg):");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura da pessoa (em cm):");
        double altura = scanner.nextDouble();

        // Cria uma nova pessoa
        Pessoa pessoa = new Pessoa(nome, idade, peso, altura);

        System.out.println("Quantos anos a pessoa deve envelhecer?");
        int anos = scanner.nextInt();
        for (int i = 0; i < anos; i++) {
            pessoa.envelhecer();
        }

        System.out.println("Quantos quilos a pessoa deve engordar?");
        double quilos = scanner.nextDouble();
        pessoa.engordar(quilos);

        System.out.println("Quantos quilos a pessoa deve emagrecer?");
        quilos = scanner.nextDouble();
        pessoa.emagrecer(quilos);

        scanner.close();
    }
}
