public class Exercicio05 {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.marca = "Vw";
        c1.modelo = "Gol";
        c1.ano = 2021;
        c1.velocidade_atual = 60;
        c1.status();
        
        c1.acelerar(10);
        c1.frear(5);
    }
}
 
class Carro{
    String marca;
    String modelo;
    int ano; 
    float velocidade_atual;
    
    public void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Ano: " + this.velocidade_atual);
        System.out.println("");
    }
    
    public void acelerar(float valor){
        this.velocidade_atual += valor;
        this.status();
    }
    
    public void frear(float valor){
        if(velocidade_atual - valor < 0){
            System.out.println("Nao e possivel diminuir essa velocidade, pois o carro esta a " + this.velocidade_atual + " por hora.");
        }
        else{
            this.velocidade_atual -= valor;
            this.status();
        }
    }
}
