class sumofnnumber{
    public static void sum(int sum,int n,int i)
    {
        if(i==n)
        {
            sum = sum+i;
            System.out.println("the sum of number 1 to n is "+sum);
            return;
        }
        sum =sum+i;
        sum(sum, n, i+1);
        System.out.println(i);
    }

    public static void SumN(int n,int sum) {
        if(n<1) {
            System.out.println(sum);
            return;
        }
        SumN(n-1, sum+n);
    }

    public static int SumOFN(int n){
        if(n==0){
            return 0;
        }
        return n+SumOFN(n-1);
    }
}


public class Q5_SumOFN_Number {
    public static void main(String[] args) {
        sumofnnumber.sum(0, 10, 1);

        sumofnnumber.SumN(10,0);

       System.out.println("the sum of n number is : "+ sumofnnumber.SumOFN(10));
    }
}
