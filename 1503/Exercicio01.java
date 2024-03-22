import java.util.Scanner;

class ContaCorrente {
    private String nomeDoCorrentista;
    private double saldo;

    public ContaCorrente(String nomeDoCorrentista) {
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = 0.0;
    }

    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito efetuado. O saldo atual de " + nomeDoCorrentista + " é: " + saldo);
    }

    public void saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque efetuado. O saldo atual de " + nomeDoCorrentista + " é: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }
}

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do correntista: ");
        String nomeDoCorrestista = scanner.nextLine();

        ContaCorrente conta = new ContaCorrente(nomeDoCorrestista);

        System.out.print("Digite o valor do depósito: R$");
        double valorDeposito = scanner.nextDouble();
        conta.deposito(valorDeposito);

        System.out.print("Digite o valor do saque: R$");
        double valorSaque = scanner.nextDouble();
        conta.saque(valorSaque);

        scanner.close();
    }

}