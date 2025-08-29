import java.util.Stack;

public class Activity_4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // TYPE Hello
        type(stack, "Hello");
        printStack(stack);

        // (U)UNDO log only
        undo("T");

        // TYPE world
        type(stack, "world");
        printStack(stack);

        // (U)UNDO log only
        undo("T");

        // TYPE Universe
        type(stack, "Universe");
        printStack(stack);

        // (U)UNDO log only
        undo("U");
        printStack(stack);
    }

    // Simulate typing (Push)
    public static void type(Stack<String> stack, String word) {
        System.out.println("Type : " + word);
        stack.push(word);
    }

    // UNDO only logs the last Type
    public static void undo(String letter) {
        System.out.println("(U)UNDO (T)TYPE :" + letter);
    }

    // Print stack as a sentence
    public static void printStack(Stack<String> stack) {
        System.out.print("Stack : ");
        for (String word : stack) {
            System.out.print(word + " ");
        }
        System.out.println("\n--------------------");
    }
}
