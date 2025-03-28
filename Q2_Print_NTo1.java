class printingNumber {

    // this is recursive way to print the number 5 to 1;
    public void Print(int n) {

        if (n == 0) { // this is the base case if n==0 then we dont have to print the number return from their
            return;
        }
        System.out.println(n);
        Print(n - 1);

    }
    public static void Prints(int n) {
        if(n==10){
            return;
        }
        Prints(n+1);
        System.out.println(n);
        

    }
}

public class Q2_Print_NTo1 {

    public static void main(String[] args) {

        /*
         * itterative way to print the number
         */
        for (int i = 10; i > 0; i--) {
         //   System.out.println(i);
        }
        System.out.println();

        printingNumber obj = new printingNumber();
        // obj.Print(10);

        printingNumber.Prints(1);

    }
}