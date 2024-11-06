public class Q6_BinarySearch {

    static int Search(int arr[],int target, int start, int end){
        int mid = start+(end-start)/2;
        if(start>end)
        {
            return -1;
        }
        else if (arr[mid]==target){
            return mid;
        }
        else if (arr[mid]<target){
            return Search(arr, target, mid+1, end);
        }
        return Search(arr, target, start, mid-1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,55,66,78};
        int target = 4;

        System.out.println(Q6_BinarySearch.Search(arr, target, 0, arr.length-1));
    }
}
