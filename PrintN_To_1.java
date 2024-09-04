class printingNumber {

    // this is recursive way to print the number 5 to 1;
    public void Print(int n) {

        if (n == 0) { // this is the base case if n==0 then we dont have to print the number return from their
            return;
        }
        System.out.println(n);
        Print(n - 1);

    }
}

public class PrintN_To_1 {

    public static void main(String[] args) {

        /*
         * itterative way to print the number
         */
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        printingNumber obj = new printingNumber();
        obj.Print(10);

    }
}