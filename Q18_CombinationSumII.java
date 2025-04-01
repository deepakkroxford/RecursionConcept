import java.util.*;

public class Q18_CombinationSumII {

    /**
     * so in CombinationSumII the only diffrence is we have to take the element one
     * time we can not do it multiple times
     * and at the end while returning the solution we have to take care the
     * combination that we make it should also be unique.
     * So we can use the HashSet<List<Integer>> and then covert in to the
     * 
     * @param arr
     * @param index
     * @param target
     * @param current
     * @param set
     */
    public static void findingCombinationSum(int arr[], int index, int target, List<Integer> current,
            HashSet<List<Integer>> set) {
        if (target == 0) {
            List<Integer> temp = new ArrayList<>(current);
            Collections.sort(temp); 
            set.add(temp);
            return;
        }
        if (index >= arr.length || arr[index] > target) {
            return;
        }
        current.add(arr[index]);
        findingCombinationSum(arr, index + 1, target - arr[index], current, set);
        current.remove(current.size() - 1);
        findingCombinationSum(arr, index + 1, target, current, set);

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // Sorting to ensure ordered combinations
        HashSet<List<Integer>> set = new HashSet<>();
        findingCombinationSum(candidates, 0, target, new ArrayList<>(), set);
        return new ArrayList<>(set);
    }

    /*
     * OPTIMIZE WAY
     */
    public static void findingCombinationSum_OptimizeWay(int arr[], int index, int target, List<Integer> current,
            List<List<Integer>> sol) {
        if (target == 0) {
            sol.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }

            if (arr[i] > target) {
                break;
            }

            current.add(arr[i]);
            findingCombinationSum_OptimizeWay(arr, i + 1, target - arr[i], current, sol);
            current.remove(current.size() - 1);
        }
    }

    public static List<List<Integer>> combinationSum2Optimize(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> sol = new ArrayList<>();
        findingCombinationSum_OptimizeWay(candidates, 0, target, new ArrayList<>(), sol);
        return sol;
    }

    public static void main(String[] args) {
        /*
         * Given a collection of candidate numbers (candidates) and a target number
         * (target), find all unique combinations in candidates where the candidate
         * numbers sum to target.
         * 
         * Each number in candidates may only be used once in the combination.
         * 
         * Note: The solution set must not contain duplicate combinations.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: candidates = [10,1,2,7,6,1,5], target = 8
         * Output:
         * [
         * [1,1,6],
         * [1,2,5],
         * [1,7],
         * [2,6]
         * ]
         * Example 2:
         * 
         * Input: candidates = [2,5,2,1,2], target = 5
         * Output:
         * [
         * [1,2,2],
         * [5]
         * ]
         * 
         * 
         * Constraints:
         * 
         * 1 <= candidates.length <= 100
         * 1 <= candidates[i] <= 50
         * 1 <= target <= 30
         */

        Q18_CombinationSumII solution = new Q18_CombinationSumII();

        // Test case 1
        int[] candidates1 = { 10, 1, 2, 7, 6, 1, 5 };
        int target1 = 8;
        System.out.println(solution.combinationSum2(candidates1, target1));
        // Expected output: [[1,1,6], [1,2,5], [1,7], [2,6]]

        // Test case 2
        int[] candidates2 = { 2, 5, 2, 1, 2 };
        int target2 = 5;
        System.out.println(solution.combinationSum2(candidates2, target2));
        // Expected output: [[1,2,2], [5]]

        // Test case 3 - No solution
        int[] candidates3 = { 2, 4, 6 };
        int target3 = 5;
        System.out.println(solution.combinationSum2(candidates3, target3));
        // Expected output: []

        // Test case 4 - Single element
        int[] candidates4 = { 1 };
        int target4 = 1;
        System.out.println(solution.combinationSum2(candidates4, target4));
        // Expected output: [[1]]

        // Test case 5 - All elements same
        int[] candidates5 = { 2, 2, 2, 2 };
        int target5 = 6;
        System.out.println(solution.combinationSum2(candidates5, target5));
        // Expected output: [[2,2,2]]
    }

}
