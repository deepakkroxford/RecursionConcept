import java.util.*;
public class Q19_CombinationSumIII {
    public static List<List<Integer>> findingAllCombinationK(int start, int k , int target , List<Integer> current) {
        List<List<Integer>> sol = new ArrayList<>();
        if(k==0 && target == 0){
            sol.add(new ArrayList<>(current));
            return sol;
        }
        
        for(int i=start;i<=9;i++) {
            if(target-i<0) break;
            current.add(i);
            sol.addAll(findingAllCombinationK(i+1, k-1, target-i, current));
            current.remove(current.size()-1);
        }
        return sol;
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        return findingAllCombinationK(1,k,n,new ArrayList<>());
    }
    public static void main(String[] args) {
        /*Leetcode: 216 Combination Sum III
         * Find all valid combinations of k numbers that sum up to n such that the
         * following conditions are true:
         * 
         * Only numbers 1 through 9 are used.
         * Each number is used at most once.
         * Return a list of all possible valid combinations. The list must not contain
         * the same combination twice, and the combinations may be returned in any
         * order.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: k = 3, n = 7
         * Output: [[1,2,4]]
         * Explanation:
         * 1 + 2 + 4 = 7
         * There are no other valid combinations.
         * Example 2:
         * 
         * Input: k = 3, n = 9
         * Output: [[1,2,6],[1,3,5],[2,3,4]]
         * Explanation:
         * 1 + 2 + 6 = 9
         * 1 + 3 + 5 = 9
         * 2 + 3 + 4 = 9
         * There are no other valid combinations.
         * Example 3:
         * 
         * Input: k = 4, n = 1
         * Output: []
         * Explanation: There are no valid combinations.
         * Using 4 different numbers in the range [1,9], the smallest sum we can get is
         * 1+2+3+4 = 10 and since 10 > 1, there are no valid combination.
         * 
         * 
         * Constraints:
         * 
         * 2 <= k <= 9
         * 1 <= n <= 60
         */

    Q19_CombinationSumIII solution = new Q19_CombinationSumIII();

    // Test case 1
    int k1 = 3;
    int n1 = 7;
    System.out.println(solution.combinationSum3(k1, n1));
    // Expected output: [[1,2,4]]

    // Test case 2
    int k2 = 3;
    int n2 = 9;
    System.out.println(solution.combinationSum3(k2, n2));
    // Expected output: [[1,2,6],[1,3,5],[2,3,4]]

    // Test case 3 - No solution
    int k3 = 4;
    int n3 = 1;
    System.out.println(solution.combinationSum3(k3, n3));
    // Expected output: []

    // Test case 4 - Maximum k
    int k4 = 9;
    int n4 = 45;
    System.out.println(solution.combinationSum3(k4, n4));
    // Expected output: [[1,2,3,4,5,6,7,8,9]]

    // Test case 5 - Edge case
    int k5 = 2;
    int n5 = 17;
    System.out.println(solution.combinationSum3(k5, n5));
    // Expected output: [[8,9]]
    }
}
