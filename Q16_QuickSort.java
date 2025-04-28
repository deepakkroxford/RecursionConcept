public class Q16_QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j) {

            while (arr[i] <= pivot && i < high ) {
                i++;
            }
            while (arr[j] > pivot && j > low) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int partionIndex = partition(arr, low, high);
            quickSort(arr, low, partionIndex - 1);
            quickSort(arr, partionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 2, 4, 1, 5, 2, 6, 4 };
        quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println( "Time Complexity: O(n log n) - Average case, O(n^2) in worst case (when pivot is always smallest or largest element)");
        System.out.println("Space Complexity: O(log n) - Due to recursion stack");
    }
}
