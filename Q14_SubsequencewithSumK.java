import java.util.*;
public class Q14_SubsequencewithSumK {
    public static void PrintingSubsequenceTargetK(int index, int arr[], int n, List<Integer>current,int sum , int target) {

        if(index==n){
            if(sum==target){
                System.out.println(current);
            }
            return;
        }
        current.add(arr[index]);
        sum = sum+arr[index];
        PrintingSubsequenceTargetK(index+1, arr, n, current, sum, target);
        sum = sum-arr[index];
        current.remove(current.size()-1);
        PrintingSubsequenceTargetK(index+1, arr, n, current, sum, target);

    }
     public static void main(String[] args) {
        int arr[] ={3,5,6,7};
        int n = arr.length;
        int target = 9;
        List<Integer> ans = new ArrayList<>();
        PrintingSubsequenceTargetK(0, arr,n, ans, 0, target);
    }
}