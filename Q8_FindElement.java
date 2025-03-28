public class Q8_FindElement {
    static boolean isFound(int arr[], int target, int index) {

        // if any point of the time if the value of array is same as the value of the
        // target then at that
        // time we have to return the true we get the value
        if (arr[index] == target) {
            return true;
        }
        // if the index valus is equal to the last index and it still not able to return
        // the value true so in
        // this case we return false...
        else if (index == arr.length - 1) {
            return false;
        }
        return isFound(arr, target, index + 1);

    }

    // this method is used to find the index of the target recursively
    static int findindex(int arr[], int target, int index) {
        if (target == arr[index]) {
            return index;
        }
        if (index == arr.length) {
            return -1;
        }

        return findindex(arr, target, index + 1);
    }
    public static boolean findNumber(int target, int arr[],int index) {
        if(index ==arr.length){
            return false;
        }
        if(arr[index]==target) {
            return true;
        }
        return findNumber(target, arr, index+1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 7;

        System.out.println(Q8_FindElement.isFound(arr, target, 0));
        System.out.println(findindex(arr, target, 0));
    }
}
