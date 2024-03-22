class Professor {
    public String nome;
    private int nivel;
    private double horasAula;

    public Professor(String nome, int nivel, double horasAula) {
        this.nome = nome;
        this.nivel = nivel;
        this.horasAula = horasAula;
    }

    public double calcularSalario() {
        double valorHoraAula;
        switch (nivel) {
            case 1:
                valorHoraAula = 20.00;
                break;
            case 2:
                valorHoraAula = 25.00;
                break;
            case 3:
                valorHoraAula = 30.00;
                break;
            default:
                valorHoraAula = 0.00;
        }

        return horasAula * valorHoraAula;
    }
}

public class Exercicio02 {
    public static void main(String[] args) {
        Professor professor = new Professor("João", 2, 40);
        double salario = professor.calcularSalario();
        System.out.println("O salário do professor " + professor.nome + " é R$" + salario);
    }
}
