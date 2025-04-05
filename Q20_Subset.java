import java.util.*;

public class Q20_Subset {
    public static List<List<Integer>> findingSubset(int arr[], int index, List<Integer> current) {
        List<List<Integer>> res = new ArrayList<>();
        if (index >= arr.length) {
            res.add(new ArrayList<>(current));
            return res;
        }
        current.add(arr[index]);
        res.addAll(findingSubset(arr, index + 1, current));
        current.remove(current.size() - 1);
        res.addAll(findingSubset(arr, index + 1, current));
        return res;
    }

    public List<List<Integer>> subsets(int[] nums) {
        return findingSubset(nums, 0, new ArrayList<>());
    }

    public static void main(String[] args) {
        /*
         * Leetcode - 78  https://leetcode.com/problems/subsets/
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

        int[] nums = { 1, 2, 3 };
        Q20_Subset subset = new Q20_Subset();
        List<List<Integer>> result = subset.subsets(nums);
        System.out.println("Subsets of " + Arrays.toString(nums) + " are:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}
