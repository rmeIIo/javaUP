public class App {
    public static void main(String[] args) throws Exception {
        ItemBiblioteca livro1 = new Livro("VBSA", 2017, "Casey", 400);
        ItemBiblioteca dvd1 = new Dvd("Lemonade Mouth", 2011, "Disney", 120);

        livro1.mostrarDetalhes();
        dvd1.mostrarDetalhes();
    }
}
