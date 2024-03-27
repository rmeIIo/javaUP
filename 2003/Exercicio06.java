public class Exercicio06 {
    public static void main(String[] args) {
        
        Lampada l1 = new Lampada();
        l1.ligar();
        l1.desligar();
        l1.quebrar();
        l1.ligar();
    }
}
 
class Lampada{
    
    String status;
    int acendimentos = 0;
    
    public void ligar(){
        
        if(status == "quebrada"){
            System.out.println("A lampada nao pode ser ligada pois esta quebrada.");
        }
        else if(status == "ligada"){
            System.out.println("A lampada ja esta ligada.");
        }
        else{
            this.status = "ligada";
            this.acendimentos++;
            System.out.println("A lampada foi ligada. Total de acendimentos: " + this.acendimentos);
        }
    }
    
    public void desligar(){
        
        if(status == "quebrada"){
            System.out.println("A lampada nao pode ser desligada pois esta quebrada.");
        }
        else if(status == "desligada"){
            System.out.println("A lampada ja esta desligada.");
        }
        else{
            this.status = "desligada";
            System.out.println("A lampada foi desligada.");
        }
    }
    
    public void quebrar(){
        this.status = "quebrada";
        System.out.println("A lampada foi quebrada.");
    }
}
