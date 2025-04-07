import java.util.*;

public class Q23PermutationII {
    public static void findingUniquePermutation(int arr[], List<Integer> current, boolean[] marked,
            HashSet<List<Integer>> sol) {
            if(current.size()==arr.length){
                sol.add(new ArrayList<>(current));
            }

            for(int i=0;i<arr.length;i++) {
                if(!marked[i]){
                    marked[i]=true;
                    current.add(arr[i]);
                    findingUniquePermutation(arr, current, marked, sol);
                    current.remove(current.size()-1);
                    marked[i]=false;
                }
            }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums); // if we dont use this sorting we get the solution
        boolean visted[] = new boolean[nums.length];
        HashSet<List<Integer>> set = new HashSet<>();
        findingUniquePermutation(nums, new ArrayList<>(), visted, set);
        return new ArrayList<>(set);

    }

    public static void main(String[] args) {
        /*
         * Leetcode 47 - Permutations II
         * 
         * Given a collection of numbers, nums, that might contain duplicates, return
         * all possible unique permutations in any order.
         * Example 1:
         * 
         * Input: nums = [1,1,2]
         * Output:
         * [[1,1,2],
         * [1,2,1],
         * [2,1,1]]
         * Example 2:
         * 
         * Input: nums = [1,2,3]
         * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
         * 
         * 
         * Constraints:
         * 
         * 1 <= nums.length <= 8
         * -10 <= nums[i] <= 10
         */

    Q23PermutationII solution = new Q23PermutationII();
    
    // Test case 1
    int[] nums1 = {1,1,2};
    System.out.println("Input: [1,1,2]");
    System.out.println("Output: " + solution.permuteUnique(nums1));
    
    // Test case 2
    int[] nums2 = {1,2,3};
    System.out.println("\nInput: [1,2,3]");
    System.out.println("Output: " + solution.permuteUnique(nums2));
    
    // Test case 3 with negative numbers
    int[] nums3 = {-1,0,1};
    System.out.println("\nInput: [-1,0,1]");
    System.out.println("Output: " + solution.permuteUnique(nums3));

    }
}