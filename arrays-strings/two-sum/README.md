# Two Sum

## Difficulty
Easy

## LeetCode Link
https://leetcode.com/problems/two-sum/

## Approach
Use a hash map to store the numbers that have already been visited.

For each number, calculate its complement using:

complement = target - current number

If the complement is already present in the hash map, return the
indices of the two numbers.

Otherwise, store the current number and its index in the hash map.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Test Cases

### Typical Test Case

Input:
nums = [2,7,11,15]
target = 9

Output:
[0,1]

### Edge Case

Input:
nums = [3,3]
target = 6

Output:
[0,1]

## Notes / Edge Cases

- The same element cannot be used twice.
- The array can contain duplicate values.
- The solution assumes exactly one valid answer.