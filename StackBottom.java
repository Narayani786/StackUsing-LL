import java.util.*;

public class StackBottom {
    public static void pushAtBottom (int data, Stack<Integer> stack) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(data, stack);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack <>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()) {
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
        pushAtBottom(0, stack);
    }
}