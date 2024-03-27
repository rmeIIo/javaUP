public class Exercicio01 {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.titulo = "O Magico de Oz";
        l1.autor = "L. Frank Baum";
        l1.ano = 1939;
        l1.status();
        
        Livro l2 = new Livro();
        l2.titulo = "1984";
        l2.autor = "George Orwell";
        l2.ano = 1949;
        l2.status();
    }
}
 
class Livro{
    String titulo;
    String autor;
    int ano;
    
    public void status(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
        System.out.println("");
    }
}
