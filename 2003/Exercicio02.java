import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Informe primeiro numero: ");
        double num1 = input.nextDouble();
        
        System.out.printf("Informe segundo numero: ");
        double num2 = input.nextDouble();
 
 
        System.out.printf("\nResultado adicao: %.1f", Calculadora.adicao(num1, num2));
        
        System.out.printf("\nResultado subtracao: %.1f", Calculadora.subtracao(num1, num2));
        
        System.out.printf("\nResultado multiplicacao: %.1f", Calculadora.multiplicacao(num1, num2));
        
        if(num2 == 0){
            System.out.printf("\nNao e possivel realizar uma divisao por 0.");
        }
        else{
            System.out.printf("\nResultado divisao: %.1f", Calculadora.divisao(num1, num2));
        }
        
        input.close();
    }
}
 
class Calculadora{
    
    public static double adicao(double num1, double num2){
        return num1 + num2;
    }
    
    public static double subtracao(double num1, double num2){
        return num1 - num2;
    }
    
    public static double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
    
    public static double divisao(double num1, double num2){
        return num1 / num2;
    }
}
