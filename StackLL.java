public class StackLL {
    private static class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
            next = null;
        }
    }
    static class Stack {
        public static Node head;
        public static boolean isEmpty () {
            return head == null;
        }
        // push 
        public static void push (int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            // insert at head
            newNode.next = head;
            head = newNode;
        }
        // pop
        public static int pop () {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        // peek
        public static int peek () {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack ();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
            
        }
    }
}