import java.util.ArrayList;
import java.util.List;

public class Q17_CombinationSum {
    public static List<List<Integer>> findingAllCombinationSum(int arr[], int index, int target,
            List<Integer> current) {
        List<List<Integer>> sol = new ArrayList<>();
        /*
         * Base Case is when the index length is == arr.length and also we have to check
         * if target === 0 if not then not add the answer just return
         */
        if (index == arr.length) {
            if (target == 0) {
                sol.add(new ArrayList<>(current));
            }
            return sol;
        }
        if (arr[index] <= target) {
            current.add(arr[index]);
            sol.addAll(findingAllCombinationSum(arr, index, target - arr[index], current));
            current.remove(current.size() - 1);
        }
        sol.addAll(findingAllCombinationSum(arr, index + 1, target, current));

        return sol;
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {

        return findingAllCombinationSum(candidates, 0, target, new ArrayList<>());

    }

    public static void main(String[] args) {
        /*
         * LeetCode :- 39
         * Given an array of distinct integers candidates and a target integer target,
         * return a list of all unique combinations of candidates where the chosen
         * numbers sum to target. You may return the combinations in any order.
         * 
         * The same number may be chosen from candidates an unlimited number of times.
         * Two combinations are unique if the frequency of at least one of the chosen
         * numbers is different.
         * 
         * The test cases are generated such that the number of unique combinations that
         * sum up to target is less than 150 combinations for the given input.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: candidates = [2,3,6,7], target = 7
         * Output: [[2,2,3],[7]]
         * Explanation:
         * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple
         * times.
         * 7 is a candidate, and 7 = 7.
         * These are the only two combinations.
         * Example 2:
         * 
         * Input: candidates = [2,3,5], target = 8
         * Output: [[2,2,2,2],[2,3,3],[3,5]]
         * Example 3:
         * 
         * Input: candidates = [2], target = 1
         * Output: []
         * 
         * 
         * Constraints:
         * 
         * 1 <= candidates.length <= 30
         * 2 <= candidates[i] <= 40
         * All elements of candidates are distinct.
         * 1 <= target <= 40
         */
        int arr[] = { 2, 3, 6, 7 };
        int target = 7;

        System.out.println(combinationSum(arr, target));
        int arr2[] = { 2, 3, 5 };
        int target2 = 8;
        System.out.println(combinationSum(arr2, target2)); // Should print [[2,2,2,2], [2,3,3], [3,5]]

        int arr3[] = { 2 };
        int target3 = 1;
        System.out.println(combinationSum(arr3, target3)); // Should print []

        int arr4[] = { 3, 4, 5 };
        int target4 = 8;
        System.out.println(combinationSum(arr4, target4)); // Should print [[3,5], [4,4]]

        int arr5[] = { 2, 4, 6 };
        int target5 = 6;
        System.out.println(combinationSum(arr5, target5)); // Should print [[2,2,2], [2,4], [6]]

        int arr6[] = {10,1,2,7,6,1,5};
        int target6 = 8;
        System.out.println(combinationSum(arr6, target6));
    }
}
