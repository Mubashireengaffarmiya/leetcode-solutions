# Binary Search

## Difficulty
Easy

## LeetCode Link
https://leetcode.com/problems/binary-search/

## Approach
Binary Search is used on the sorted array. We maintain left and right
boundaries and repeatedly check the middle element. If the middle element
is smaller than the target, we search the right half. Otherwise, we search
the left half.

## Time Complexity
O(log n)

## Space Complexity
O(1)

## Test Cases

### Typical Test Case
Input:
nums = [-1,0,3,5,9,12]
target = 9

Output:
4

### Edge Case
Input:
nums = [5]
target = 2

Output:
-1

## Notes / Edge Cases
- The input array must be sorted.
- If the target is not present, return -1.
- A single-element array is handled correctly.
- An empty array returns -1.