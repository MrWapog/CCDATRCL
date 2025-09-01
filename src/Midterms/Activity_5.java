package Midterms;
import java.util.Stack;

public class Activity_5 {
    static Stack<String> stack = new Stack<>();
    static Stack<String> redoStack = new Stack<>();

    public static void main(String[] args) {
        // TYPE Hello
        type("Hello");
        printStack();

        // (U)UNDO
        undo("T");

        // TYPE world
        type("world");
        printStack();

        // (U)UNDO
        undo("T");

        // TYPE Universe
        type("Universe");
        printStack();

        // (U)UNDO Universe
        undo("U");
        printStack();

        // (R)REDO Universe
        redo("R");
        printStack();
    }

    // (Push)
    public static void type(String word) {
        System.out.println("Type : " + word);
        stack.push(word);
        // typing clears redo history
        redoStack.clear();
    }

    // UNDO action which is (U)
    public static void undo(String letter) {
        System.out.println("(U)UNDO (T)TYPE (R)REDO :" + letter);
        if ("U".equalsIgnoreCase(letter) && !stack.isEmpty()) {
            redoStack.push(stack.pop());
        }
        // when letter is "T"
    }

    // REDO action
    public static void redo(String letter) {
        System.out.println("(U)UNDO (T)TYPE (R)REDO :" + letter);
        if ("R".equalsIgnoreCase(letter) && !redoStack.isEmpty()) {
            stack.push(redoStack.pop());
        }
    }

    // Print stack
    public static void printStack() {
        System.out.print("Stack : ");
        for (String word : stack) {
            System.out.print(word + " ");
        }
        System.out.println("\n--------------------");
    }
}
