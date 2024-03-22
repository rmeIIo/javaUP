class Aluno {
    private String nome;
    private double nota1, nota2, nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void imprimirMedia() {
        double media = (nota1 + nota2 + nota3) / 3;
        System.err.println("O aluno " + nome + " tem uma média de " + media);
    }
}

public class Exercicio01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 7.5, 8.0, 9.0);
        aluno.imprimirMedia();
    }
}