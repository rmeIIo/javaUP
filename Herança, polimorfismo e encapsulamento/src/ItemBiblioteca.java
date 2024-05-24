public class ItemBiblioteca {
    private String titulo;
    private int anoPublicacao;

    public ItemBiblioteca() {}

    public ItemBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    // - Método mostrarDetalhes(), que deve apresentar o título e o ano de publicação do item.

    public void mostrarDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Ano de publicação: " + this.anoPublicacao);
    }
}
