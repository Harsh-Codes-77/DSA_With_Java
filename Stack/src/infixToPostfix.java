import java.util.Scanner;

/**
 * The InfixToPostfix class provides functionality to convert an infix
 * mathematical expression to its postfix equivalent using the shunting-yard algorithm.
 * It includes its own internal stack for handling operators.
 */
class InfixToPostfix {

    // Internal stack implementation for characters (operators).
    private char[] stack;
    private int top;
    private static final int MAX_SIZE = 20; // Max expression/stack size

    /**
     * Constructor to initialize the internal stack.
     */
    public InfixToPostfix() {
        stack = new char[MAX_SIZE];
        top = -1;
    }

    // --- Stack Operations ---

    /**
     * Pushes a character onto the stack.
     * @param item The character to push.
     */
    private void push(char item) {
        if (top >= MAX_SIZE - 1) {
            // In a real-world app, you might throw an exception here.
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = item;
        }
    }

    /**
     * Pops a character from the stack.
     * @return The popped character.
     */
    private char pop() {
        if (isEmpty()) {
            // This condition should ideally not be hit with valid expressions.
            // Returning a null character or throwing an exception are options.
            System.out.println("Stack Underflow");
            return '\0';
        }
        return stack[top--];
    }

    /**
     * Peeks at the top character of the stack without removing it.
     * @return The character at the top of the stack.
     */
    private char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return stack[top];
    }

    /**
     * Checks if the stack is empty.
     * @return true if the stack is empty, false otherwise.
     */
    private boolean isEmpty() {
        return top == -1;
    }

    // --- Conversion Logic ---

    /**
     * Determines the precedence of an operator.
     * Higher return value means higher precedence.
     * @param op The operator character.
     * @return An integer representing the operator's priority.
     */
    private int priority(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
            case '%':
                return 2;
            case '(': // Parentheses have the lowest precedence during checks
                return 0;
            default:
                return -1; // Not a valid operator
        }
    }

    /**
     * Converts the given infix expression to a postfix expression.
     * @param infix The string containing the infix expression.
     */
    public void convert(String infix) {
        StringBuilder postfix = new StringBuilder();

        for (char ch : infix.toCharArray()) {
            // If the character is a letter or a digit, append it to the postfix string.
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }
            // If it's an opening parenthesis, push it onto the stack.
            else if (ch == '(') {
                push(ch);
            }
            // If it's a closing parenthesis, pop from stack until an opening parenthesis is found.
            else if (ch == ')') {
                while (!isEmpty() && peek() != '(') {
                    postfix.append(pop());
                }
                if (isEmpty()) {
                    System.out.println("Invalid infix expression: Unbalanced parentheses.");
                    return;
                }
                pop(); // Pop the opening parenthesis '('
            }
            // If it's an operator.
            else {
                // While stack is not empty and the top operator has higher or equal precedence,
                // pop it and append to the postfix string.
                while (!isEmpty() && priority(peek()) >= priority(ch)) {
                    postfix.append(pop());
                }
                // Push the current operator onto the stack.
                push(ch);
            }
        }

        // After scanning the whole expression, pop any remaining operators from the stack.
        while (!isEmpty()) {
            char remaining = pop();
            if (remaining == '(') { // Check for unbalanced parentheses
                System.out.println("Invalid infix expression: Unbalanced parentheses.");
                return;
            }
            postfix.append(remaining);
        }

        System.out.println("Postfix expression: " + postfix.toString());
    }
}

/**
 * The Main class to drive the infix to postfix conversion.
 */
public class infixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InfixToPostfix converter = new InfixToPostfix();

        System.out.print("Enter the infix expression: ");
        String expression = scanner.nextLine();

        converter.convert(expression);

        scanner.close();
    }
}