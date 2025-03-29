import java.util.*;

public class Q13_PrintingSubsequence {
    public static void findingSubsequence(int arr[], List<Integer> res, int n, int index) {

        if (index >= n) {
            System.out.println(res);
            return;
        }
        res.add(arr[index]);
        findingSubsequence(arr, res, n, index + 1);
        res.remove(res.size() - 1);
        findingSubsequence(arr, res, n, index + 1);

    }

    /*
     * Solving in the leetCode way
     */
    public static List<List<Integer>> findingSubset(int index, int arr[], int n, List<Integer> current) {
        List<List<Integer>> res = new ArrayList<>();
        /*
         * base case : if the length of index greater than or equal to the length of the
         * array we have to return
         */
        if (index >= n) {
            res.add(new ArrayList<>(current));
            return res;
        }
        current.add(arr[index]);
        res.addAll(findingSubset(index + 1, arr, n, current));
        current.remove(current.size() - 1);
        res.addAll(findingSubset(index + 1, arr, n, current));
        return res;
    }

    public static List<List<Integer>> subsets(int[] nums) {
        return findingSubset(0, nums, nums.length, new ArrayList<>());
    }

    public static void main(String[] args) {

        /*
         * Leetcode - 78 Subset https://leetcode.com/problems/subsets/description/
         * Given an integer array nums of unique elements, return all possible subsets
         * (the power set).
         * 
         * The solution set must not contain duplicate subsets. Return the solution in
         * any order.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,2,3]
         * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
         * Example 2:
         * 
         * Input: nums = [0]
         * Output: [[],[0]]
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 10
         * -10 <= nums[i] <= 10
         * All the numbers of nums are unique.
         */
        int arr[] = { 3, 2, 1 };
        List<Integer> res = new ArrayList<>();
        findingSubsequence(arr, res, arr.length, 0);

        List<List<Integer>> answer = subsets(arr);
        System.out.println(answer);

    }
}
