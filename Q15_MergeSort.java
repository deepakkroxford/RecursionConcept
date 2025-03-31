public class Q15_MergeSort {
    
    public static void merge(int arr[], int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        int temp[] = new int[high - low + 1];
        int index = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        while (right <= high) {
            temp[index++] = arr[right++];
        }

        System.arraycopy(temp, 0, arr, low, temp.length);
    }

    public static void mergeSort(int arr[], int low, int high) {
        /*
         * base case
         */
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {

        int arr[] = { 3, 1, 2, 4, 1, 5, 2, 6, 4 };
        mergeSort(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.println(i);
        }

    System.out.println("Time Complexity: O(n log n) - The array is repeatedly divided into halves (log n) and then merged (n)");
    System.out.println("Space Complexity: O(n) - Additional temporary array is used during merging");

    }
}
