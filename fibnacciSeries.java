
class fib{
    public static void sum(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }
        int c= a+b;
        System.out.println(c);
        sum(b, c, n-1);
      
    }
}

public class fibnacciSeries {
    public static void main(String[] args) {
        int n =10;
        int a =0;
        int b =1;
        System.out.println(a);
        System.out.println(b);
        fib.sum(a, b, n-1);
        
    }
}
