# Valid Parentheses

## Difficulty
Easy

## LeetCode Link
https://leetcode.com/problems/valid-parentheses/

## Approach
Use a stack to store opening brackets. When a closing bracket is found,
compare it with the most recent opening bracket. If they match, continue.
If they do not match, the string is invalid.

At the end, the stack must be empty for the parentheses to be valid.

## Time Complexity
O(n)

## Space Complexity
O(n)

## Test Cases

### Typical Test Case
Input:
s = "()[]{}"

Output:
true

### Edge Case
Input:
s = "("

Output:
false

## Notes / Edge Cases
- Opening brackets are pushed onto the stack.
- Closing brackets must match the most recent opening bracket.
- An unmatched closing bracket makes the string invalid.
- If the stack is not empty at the end, the string is invalid.