class print {
    public void prints(int n)
    {
        if(n==0)
        {
            return;
        }
        prints(n-1);
        System.out.print(n+" ");
       
        
    }

    public void printx(int n)
    {

        //this is called the base condition 
        /*
         * So the base condition is a condition where our recursion stops making the new calls.
         * if we not use the base condition so the stack memory is start filling up.. and at some time memory of the 
         * computer getting full and give the stack overflow error . so the base condition is very important in the 
         * recursion......
         * 
         * 
         */
        if(n==10)
        {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printx(n+1);
       
    }
}

public class Q1_Print_1ToN {
    public static void main(String[] args) {
        
        /*
         * Itterative way to print the number
         */
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
        System.out.println();

        print obj = new print();
        obj.prints(10);

        print obj2 = new print();
        obj2.printx(1);
    }
}
