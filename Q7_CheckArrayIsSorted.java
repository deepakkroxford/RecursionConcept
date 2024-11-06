


public class Q7_CheckArrayIsSorted {
    static boolean isSorted(int arr[], int index){
        if(index ==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1])
        {
            return false;
        }

        // return  isSorted(arr, index+1);
        return arr[index]<arr[index+1] && isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,8,4,5,6,7};

        System.out.println(Q7_CheckArrayIsSorted.isSorted(arr, 0));
    }
}
