import java.util.Stack;

public class StackSort {


    private static void insertSorted(Stack<Integer> stack, int element) {

        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
        } else {

            int temp = stack.pop();
            insertSorted(stack, element);
            stack.push(temp);
        }
    }

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {

        if (!stack.isEmpty()) {

            int element = stack.pop();

            sortStack(stack);

            insertSorted(stack, element);
        }
    }

    // Main function for testing
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        // Sort the stack
        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
