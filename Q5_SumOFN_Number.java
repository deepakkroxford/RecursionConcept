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
}


public class Q5_SumOFN_Number {
    public static void main(String[] args) {
        sumofnnumber.sum(0, 10, 1);
    }
}
