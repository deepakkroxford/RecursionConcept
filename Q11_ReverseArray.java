public class Q11_ReverseArray {
    public static void Reversing (int start, int end , int arr[]) {
        if(start >= end) {
            return;
        }
            int temp  = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;
            Reversing(start+1,end-1,arr);
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        /*
         * We we pass the primitive data type like int , float , double , char , long etc so we are passing the value not the
         * refrence of the value.it means we passing the copy of the original.
         * But when we passing the arr so array is a object so we are actully passing the refrence of the array. whatever the change
         * we have done it will reflect in the original array .
         */
        Reversing(0, arr.length - 1, arr);

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
