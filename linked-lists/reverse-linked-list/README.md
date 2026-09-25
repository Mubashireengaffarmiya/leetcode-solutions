# Reverse Linked List

## Difficulty
Easy

## LeetCode Link
https://leetcode.com/problems/reverse-linked-list/

## Approach
Use three pointers: previous, current, and nextNode.

The current node's next pointer is changed to point to the previous node.
Then the pointers are moved forward until the entire linked list is reversed.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Test Cases

### Typical Test Case
Input:
1 -> 2 -> 3 -> 4 -> 5

Output:
5 -> 4 -> 3 -> 2 -> 1

### Edge Case
Input:
1

Output:
1

## Notes / Edge Cases
- An empty linked list returns null.
- A single-node linked list remains unchanged.
- The iterative approach uses constant extra space.