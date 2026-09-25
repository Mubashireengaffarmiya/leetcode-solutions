# Merge Two Sorted Lists

## Difficulty
Easy

## LeetCode Link
https://leetcode.com/problems/merge-two-sorted-lists/

## Approach
Use a dummy node and compare the current nodes of both sorted linked lists.
Attach the smaller node to the result list and move that list forward.

When one list becomes empty, attach the remaining nodes of the other list.

## Time Complexity
O(n + m)

## Space Complexity
O(1)

## Test Cases

### Typical Test Case
Input:
list1 = [1,2,4]
list2 = [1,3,4]

Output:
[1,1,2,3,4,4]

### Edge Case
Input:
list1 = []
list2 = [0]

Output:
[0]

## Notes / Edge Cases
- Either linked list can be empty.
- Both lists are already sorted.
- The remaining nodes are attached after one list becomes empty.
- The algorithm uses constant extra space.