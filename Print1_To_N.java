class printto5{
    public void print(int n)
    {
        if(n==0)
        {
            return;
        }
        print(n-1);
        System.out.print(n+" ");
       
        
    }
}

public class Print1_To_N {
    public static void main(String[] args) {
        
        /*
         * Itterative way to print the number
         */
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
        System.out.println();

        printto5 obj = new printto5();
        obj.print(10);
    }
}
