# Valid Anagram

## Difficulty
Easy

## LeetCode Link
https://leetcode.com/problems/valid-anagram/

## Approach
Convert both strings into character arrays, sort the arrays, and compare
them. If the sorted arrays are equal, the two strings are anagrams.

## Time Complexity
O(n log n)

## Space Complexity
O(n)

## Test Cases

### Typical Test Case
Input:
s = "anagram"
t = "nagaram"

Output:
true

### Edge Case
Input:
s = "a"
t = "ab"

Output:
false

## Notes / Edge Cases
- If the two strings have different lengths, they cannot be anagrams.
- Character frequency must be the same in both strings.
- Empty strings are also valid inputs.