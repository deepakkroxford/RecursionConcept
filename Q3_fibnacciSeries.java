
class fib{
    // public static void sum(int a,int b,int n)
    // {
    //     if(n==0)
    //     {
    //         return;
    //     }
    //     int c= a+b;
    //     System.out.println(c);
    //     sum(b, c, n-1);
      
    // }

    //this is the other way to print the fibnacci serires 
   public int fibnaci(int n)
    {
        if(n<2)
        {
            return n;
        }

        //this is also called the recrance realtions
        return fibnaci(n-1)+fibnaci(n-2);
    }
}

public class Q3_fibnacciSeries {
    public static void main(String[] args) {
        // int n =10;
        int a =0;
        int b =1;
        System.out.println(a);
        System.out.println(b);
        // fib.sum(a, b, n-1);

         fib obj =new fib();
          int x =obj.fibnaci(10);
          System.out.println(x);
        
    }
}
