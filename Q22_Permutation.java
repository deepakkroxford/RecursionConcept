import java.util.*;

public class Q22_Permutation {
    public static List<List<Integer>> findingAllPermutation(int arr[], List<Integer> current, boolean marked[],
            List<List<Integer>> sol) {
        if (current.size() == arr.length) {
            sol.add(new ArrayList<>(current));
            return sol;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!marked[i]) {
                marked[i] = true;
                current.add(arr[i]);
                findingAllPermutation(arr, current, marked, sol);
                current.remove(current.size() - 1);
                marked[i] = false;

            }
        }
        return sol;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        boolean[] marked = new boolean[nums.length];
        return findingAllPermutation(nums, new ArrayList<>(), marked, sol);
    }

    public static void main(String[] args) {
        /*
         * Leetcode 46: Permutations
         * Given an array nums of distinct integers, return all the possible
         * permutations. You can return the answer in any order.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: nums = [1,2,3]
         * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
         * Example 2:
         * 
         * Input: nums = [0,1]
         * Output: [[0,1],[1,0]]
         * Example 3:
         * 
         * Input: nums = [1]
         * Output: [[1]]
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 6
         * -10 <= nums[i] <= 10
         * All the integers of nums are unique.
         */
        Q22_Permutation solution = new Q22_Permutation();

        // Test case 1
        int[] nums1 = { 1, 2, 3 };
        System.out.println("Permutations for [1, 2, 3]:");
        System.out.println(solution.permute(nums1));

        // Test case 2
        int[] nums2 = { 0, 1 };
        System.out.println("\nPermutations for [0, 1]:");
        System.out.println(solution.permute(nums2));

        // Test case 3
        int[] nums3 = { 1 };
        System.out.println("\nPermutations for [1]:");
        System.out.println(solution.permute(nums3));

        System.out.println("\nTime Complexity: O(n!) - Since there are n! permutations for n distinct elements");
        System.out.println("Space Complexity: O(n!) - To store all permutations in the result list");
    }
}
