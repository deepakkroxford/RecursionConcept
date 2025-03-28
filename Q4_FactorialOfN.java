class Factorial {
    public static int fact(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        int nminusq1 = fact((n - 1));
        int Factorialn = n * nminusq1;

        return Factorialn;

    }

    public static int findFactorial(int n) {
        if(n==0){
            return 1;
        }
        return n * findFactorial(n-1);
    }
}

public class Q4_FactorialOfN {
    public static void main(String[] args) {
        System.out.println(Factorial.fact(5));
        System.out.println(Factorial.findFactorial(5));
    }
}
