public class Dvd extends ItemBiblioteca {
    private String categoria;
    private int duracaoMinutos;

    public Dvd() {super();}

    public Dvd(String titulo, int anoPublicacao, String categoria, int duracaoMinutos){
        super(titulo, anoPublicacao);
        this.categoria = categoria;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Duração (minutos): " + this.duracaoMinutos);
    }
}