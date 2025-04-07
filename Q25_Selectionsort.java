public class Q25_Selectionsort {

    public static int findMinIndex(int[] arr, int start, int end) {
        int minIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void selectionSort(int[] arr, int start) {
        // Base case: if starting index reaches the end
        if (start >= arr.length - 1)
            return;

        // Find index of the minimum element
        int minIndex = findMinIndex(arr, start, arr.length - 1);

        // Swap with the first element of the unsorted part
        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;

        // Recur for the remaining unsorted array
        selectionSort(arr, start + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 24, 23, 4, 12, 8, 22, 1, 3, 54, 12 };

        for (int i = 0; i < arr.length; i++) {
            int x = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[x] > arr[j]) {
                    x = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[x];
            arr[x] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
