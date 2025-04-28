class Factorial {
    public static int fact(int n) {

        //factorial of 0 and 1 is 1 this is the base condition and important poin to remember is 
        // factorial of 0 is also 1
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
