public class Livro extends ItemBiblioteca {
    private String autor;
    private int numeroPaginas;

    public Livro() {super();}

    public Livro(String titulo, int anoPublicacao, String autor, int numeroPaginas) {
        super(titulo, anoPublicacao);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numeroPaginas);
    }
}
