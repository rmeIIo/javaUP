public class Exerciocio05 {
    public static int maiorEntreTres(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }    

    public static void main(String[] args) {
        int maior = maiorEntreTres(10, 20, 30);
        System.out.println("O maior número é: " + maior);
    }
}
