public class Exercicio06 {
    public static void main(String[] args) {
        int n = 10, t1 = 1, t2 = 1;

        System.out.printf("Os primeiros %d números da sequência de Fibonacci: ", n);

        for (int i = 1; i <= n; ++i) {
            System.err.printf("%d, ", t1);

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

        System.out.println();
    }    
}
