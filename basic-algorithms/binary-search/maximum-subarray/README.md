# Maximum Subarray

## Difficulty
Medium

## LeetCode Link
https://leetcode.com/problems/maximum-subarray/

## Approach
Use Kadane's Algorithm. Maintain the maximum sum of a subarray ending
at the current position. At every element, decide whether to start a
new subarray or extend the existing subarray.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Test Cases

### Typical Test Case
Input:
nums = [-2,1,-3,4,-1,2,1,-5,4]

Output:
6

### Edge Case
Input:
nums = [-5]

Output:
-5

## Notes / Edge Cases
- The array contains at least one element.
- All numbers can be negative.
- The maximum subarray can contain a single element.