public class Atividade {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Machado de Assis", "Brasileira");
        Autor autor2 = new Autor("George Orwell", "Britanica");
        
        Livro livro1 = new Livro("Quincas Borba", 1891, autor1);
        Livro livro2 = new Livro("A revolucao dos bichos", 1945, autor2);
        
        livro1.imprimirDetalhes();
        livro2.imprimirDetalhes();
    }
}

class Autor {
    public String nome;
    public String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }
}

class Livro {
    public String titulo;
    public int anoPublicacao;
    public Autor autor;

    public Livro(String titulo, int anoPublicacao, Autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public void imprimirDetalhes() {
        System.out.println("Titulo do livro: " + titulo);
        System.out.println("Ano publicacao: " + anoPublicacao);
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Nacionalidade do autor: " + autor.getNacionalidade() + "\n");
    }
}