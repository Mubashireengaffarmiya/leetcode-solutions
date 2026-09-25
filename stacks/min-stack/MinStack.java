import java.util.Stack;

public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int removed = stack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        // Typical test case
        MinStack ms1 = new MinStack();

        ms1.push(-2);
        ms1.push(0);
        ms1.push(-3);

        System.out.println(ms1.getMin());

        ms1.pop();

        System.out.println(ms1.top());
        System.out.println(ms1.getMin());

        // Edge case
        MinStack ms2 = new MinStack();

        ms2.push(5);

        System.out.println(ms2.getMin());
        System.out.println(ms2.top());
    }
}
