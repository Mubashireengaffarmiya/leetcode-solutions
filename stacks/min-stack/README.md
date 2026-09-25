# Min Stack

## Difficulty
Medium

## LeetCode Link
https://leetcode.com/problems/min-stack/

## Approach
Use two stacks. The first stack stores all values, while the second stack
keeps track of the minimum value at each stage.

Whenever a new value is pushed, it is also added to the minimum stack if
it is smaller than or equal to the current minimum.

## Time Complexity
O(1) for push, pop, top, and getMin

## Space Complexity
O(n)

## Test Cases

### Typical Test Case
Operations:
push(-2), push(0), push(-3), getMin(), pop(), top(), getMin()

Output:
-3
0
-2

### Edge Case
Operations:
push(5), getMin(), top()

Output:
5
5

## Notes / Edge Cases
- Both stacks must remain synchronized.
- The minimum stack stores the current minimum.
- Duplicate minimum values are handled using <=.
- All required operations run in constant time.