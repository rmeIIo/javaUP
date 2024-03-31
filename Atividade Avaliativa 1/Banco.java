class ContaBancaria {
    public String numeroConta;
    protected String tipoConta;
    private String titularConta;
    private double saldo;
    private boolean status;

    public ContaBancaria() {
        this.status = false;
        this.saldo = 0;
    }

    public void abrirConta(String numeroConta, String tipoConta, String titularConta) {
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.titularConta = titularConta;
        this.status = true;

        if(tipoConta.equals("CC")) {
            this.saldo = 50;
        } else if (tipoConta.equals("CP")) {
            this.saldo = 150;
        }
    }

    public void fecharConta() {
        if (this.status && this.saldo == 0) {
            this.status = false;
            System.out.println("Conta fechada com sucesso.");
        } else {
            System.out.println("Falha ao fechar a conta. Verifique o status e o saldo da conta!");
        }
    }

    public void depositar(double valor) {
        if(this.status) {
            if(valor <= 0) {
                System.out.println("Falha ao depositar. O valor do depósito deve ser positivo!");
            } else {
                this.saldo += valor;
                System.out.println("Depósito realizado com sucesso.\nNúmero da conta: " + this.numeroConta + "\nNome do titular: " + this.titularConta + "\nSaldo atual: R$" + this.saldo);
            }
        } else {
            System.out.println("Falha ao depositar. Verifique o status da conta.");
        }
    }

    public void sacar(double valor) {
        if(this.status && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.\nNúmero da conta: " + this.numeroConta + "\nNome do titular: " + this.titularConta + "\nSaldo atual: R$" + this.saldo);
        } else if (this.status && valor > this.saldo) {
            System.out.println("Falha ao sacar. Saldo insuficiente!");
        } else {
            System.out.println("Falha ao sacar. Verifique o status e o saldo da conta.");
        }
    }

    public void pagarMensalidade() {
        if(this.status) {
            if(this.tipoConta.equals("CC") && this.saldo >= 12) {
                this.saldo -= 12;
                System.out.println("Mensalidade paga com sucesso. \nNúmero da conta: " + this.numeroConta + "\nNome do titular: " + this.titularConta + "\nSaldo atual: R$" + this.saldo);
            } else if(this.tipoConta.equals("CP") && this.saldo >= 20) {
                this.saldo -= 20;
                System.out.println("Mensalidade paga com sucesso. \nNúmero da conta: " + this.numeroConta + "\nNome do titular: " + this.titularConta + "\nSaldo atual: R$" + this.saldo);
            } else {
                System.out.println("Falha ao pagar a mensalidade. Verifique o saldo da conta.");
            }
        } else {
            System.out.println("Falha ao pagar mensalidade. Verique o status da conta.");
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

public class Banco {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------");

        // Criar uma conta corrente com número 123, titular "Roger" e saldo inicial de R$ 50,00.
        ContaBancaria conta1 = new ContaBancaria();
        conta1.abrirConta("123", "CC", "Roger");

        // Criar uma conta poupança com número 456, titular "Roger" e saldo inicial de R$ 150,00.
        ContaBancaria conta2 = new ContaBancaria();
        conta2.abrirConta("456", "CP", "Roger");

        // Tentar fechar uma conta que existe, mas está com saldo diferente de zero.
        System.out.println("Teste 1\n");
        ContaBancaria conta3 = new ContaBancaria();
        conta3.abrirConta("789", "CC", "Roger");
        conta3.fecharConta();
        System.out.println("-----------------------------------------------------");

        // Fechar uma conta que existe e tem saldo zero.
        System.out.println("Teste 2\n");
        conta2.sacar(150);
        conta2.fecharConta();
        System.out.println("-----------------------------------------------------");

        // Tentar depositar em uma conta que existe, mas está fechada.
        System.out.println("Teste 3\n");
        conta2.depositar(200);
        System.out.println("-----------------------------------------------------");

        // Realizar um depósito válido em uma conta corrente e verificar o saldo atual.
        System.out.println("Teste 4\n");
        conta1.depositar(100);
        System.out.println("-----------------------------------------------------");

        // Realizar um depósito válido em uma conta poupança e verificar o saldo atual.
        System.out.println("Teste 5\n");
        ContaBancaria conta4 = new ContaBancaria();
        conta4.abrirConta("1123", "CP", "Roger");
        conta4.depositar(100);
        System.out.println("-----------------------------------------------------");

        // Tentar sacar de uma conta que existe, mas está fechada.
        System.out.println("Teste 6\n");
        conta2.sacar(200);
        System.out.println("-----------------------------------------------------");

        // Tentar sacar um valor maior que o saldo disponível na conta.
        System.out.println("Teste 7\n");
        conta1.sacar(500);
        System.out.println("-----------------------------------------------------");

        // Realizar um saque válido em uma conta e verificar o saldo atual.
        System.out.println("Teste 8\n");
        conta1.sacar(50);
        System.out.println("-----------------------------------------------------");

        // Tentar pagar a mensalidade de uma conta que existe, mas está fechada.
        System.out.println("Teste 9\n");
        conta2.pagarMensalidade();
        System.out.println("-----------------------------------------------------");

        // Tentar pagar a mensalidade sem saldo suficiente na conta.
        System.out.println("Teste 10\n");
        conta3.sacar(50);
        conta3.pagarMensalidade();
        System.out.println("-----------------------------------------------------");

        // Pagar a mensalidade de uma conta corrente com saldo suficiente e verificar o saldo atual.
        System.out.println("Teste 11\n");
        conta1.pagarMensalidade();
        System.out.println("-----------------------------------------------------");
        
        // Pagar a mensalidade de uma conta poupança com saldo suficiente e verificar o saldo atual.
        System.out.println("Teste 12\n");
        conta4.pagarMensalidade();
        System.out.println("-----------------------------------------------------");
    }
}