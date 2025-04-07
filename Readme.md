## Q1->Why Recursion?
 ```
Ans:-
--** It helps in solving the bigger and complex problem in a simple way.

**--** You can convert the recusion solution into itearation and vice versa. 

**--** Space complexity is not constant because of recursive calls

**--**  

```

## How to Approach the Problem

```
1. Identify if you can break the problem into the smaller problem 

2. Write the recurrence relation if needed

3. Draw the recusive treee

4. About the tree:
 ** See the flow of function how they are executing 
 ** identify and focus on left tree call and then the right tree call.
 ** Draw the trr and pointer again and again using the pen and paper
 ** use the debgger to see the flow of the code 
 ** see how the value are returened at each step and see where the function call will come out. 
```

## Types Of Recurrance Relation

```
Linear Reacurrence relation 
Divide and Conquer  recurrence relation
```

## Tip:
```
so if there is some return in your method so make sure when u calling the recursion you return that recursion...
```

## Note:
```
The code for printing subsequences and finding subsets is similar because:
1. Both use recursion to explore all possible combinations
2. Both follow the "take or not take" approach for each element
3. The base case is the same - when we reach the end of the array
4. The recursive calls are structured similarly:
   - First call includes the current element
   - Second call excludes the current element
The main difference is that subset finding stores all combinations in a result list,
while subsequence printing directly prints the combinations

```

