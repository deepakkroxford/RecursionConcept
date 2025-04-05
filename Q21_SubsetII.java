import java.util.*;

public class Q21_SubsetII {
    public static void findingSubset(int arr[], int index, List<Integer> current, HashSet<List<Integer>> set) {

        if (index >= arr.length) {
            List<Integer> temp = new ArrayList<>(current);
            Collections.sort(temp);
            set.add(temp);
            return;
        }
        current.add(arr[index]);
        findingSubset(arr, index + 1, current, set);
        current.remove(current.size() - 1);
        findingSubset(arr, index + 1, current, set);

        /* we can also write this code to skip the duplicate where there is no need of the HashSet collection
         * result.add(new ArrayList<>(current));
         * 
         * for (int i = index; i < arr.length; i++) {
         * // Skip duplicates
         * if (i > index && arr[i] == arr[i - 1]) continue;
         * 
         * current.add(arr[i]);
         * findingSubset(arr, i + 1, current, result);
         * current.remove(current.size() - 1);
         * }
         */

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        HashSet<List<Integer>> set = new HashSet<>();
        findingSubset(nums, 0, new ArrayList<>(), set);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        /*
         * Leetcode 90 :- https://leetcode.com/problems/subsets-ii/description/
         * Given an integer array nums that may contain duplicates, return all possible
         * subsets (the power set).
         * 
         * The solution set must not contain duplicate subsets. Return the solution in
         * any order.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,2,2]
         * Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
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
         * 
         */

        Q21_SubsetII solution = new Q21_SubsetII();

        // Test case 1
        int[] nums1 = { 1, 2, 2 };
        System.out.println(solution.subsetsWithDup(nums1));
        // Expected output: [[], [1], [1, 2], [1, 2, 2], [2], [2, 2]]

        // Test case 2
        int[] nums2 = { 0 };
        System.out.println(solution.subsetsWithDup(nums2));
        // Expected output: [[], [0]]

        // Test case 3 - All elements same
        int[] nums3 = { 2, 2, 2 };
        System.out.println(solution.subsetsWithDup(nums3));
        // Expected output: [[], [2], [2, 2], [2, 2, 2]]

        // Test case 4 - Single element
        int[] nums4 = { 1 };
        System.out.println(solution.subsetsWithDup(nums4));
        // Expected output: [[], [1]]

        // Test case 5 - Negative numbers
        int[] nums5 = { -1, 0, 1 };
        System.out.println(solution.subsetsWithDup(nums5));
        // Expected output: [[], [-1], [-1, 0], [-1, 0, 1], [-1, 1], [0], [0, 1], [1]]
    }
}
