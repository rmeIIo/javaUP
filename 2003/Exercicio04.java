
public class Exercicio04 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        j1.nome = "Marcelo";
        j1.pontuacao = 10;
        j1.nivel = 1;
        j1.status();
        
        j1.aumentar_pontuacao();
        j1.aumentar_nivel();
    }
}
 
class Jogador{
    String nome;
    int pontuacao;
    int nivel;
    
    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Pontuacao: " + this.pontuacao);
        System.out.println("Nivel: " + this.nivel);
        System.out.println("");
    }
    
    public void aumentar_pontuacao(){
        this.pontuacao++;
        this.status();
    }
    
    public void diminuir_pontuacao(){
        
        if(this.pontuacao > 0){
            this.pontuacao--;
            this.status();
        }
        else{
            System.out.println("Nao e possivel diminuir a pontuacao pois o jogador nao possui pontuacao.");
        }
    }
    
     public void aumentar_nivel(){
        this.nivel++;
        this.status();
    }
    
    public void diminuir_nivel(){
        
        if(this.nivel > 1){
            this.nivel--;
            this.status();
        }
        else{
            System.out.println("Nao e possivel diminuir o nivel do jogador pois ele encontra-se no nivel 1.");
        }
    }
}
