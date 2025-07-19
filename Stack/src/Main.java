import java.util.Scanner;

class StackArray {
    // Defines the maximum size of the stack. 'final' makes it a constant.
    private static final int MAX_SIZE = 10;
    // The array to store stack elements.
    private int[] arr;
    // 'top' points to the index of the top element of the stack.
    private int top;

    /**
     * Constructor to initialize the stack.
     * It creates the array and sets the initial state of the stack to empty.
     */
    public StackArray() {
        arr = new int[MAX_SIZE];
        top = -1; // A 'top' of -1 indicates the stack is empty.
    }

    /**
     * Pushes an element onto the top of the stack.
     * @param element The integer element to be pushed.
     */
    public void push(int element) {
        // Check for stack overflow before pushing.
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack is overflow.");
        } else {
            // Increment top first, then assign the element to the new top position.
            arr[++top] = element;
            System.out.println("Successfully pushed.");
        }
    }

    /**
     * Removes and prints the top element of the stack.
     */
    public void pop() {
        // Check for stack underflow before popping.
        if (isEmpty()) {
            System.out.println("Stack is underflow.");
        } else {
            // Print the element at the current top, then decrement top.
            System.out.println("Popped value = " + arr[top--]);
        }
    }

    /**
     * Prints the top element of the stack without removing it.
     */
    public void peek() {
        // Check if the stack is empty before peeking.
        if (isEmpty()) {
            System.out.println("Stack is underflow.");
        } else {
            System.out.println("Peek value = " + arr[top]);
        }
    }

    /**
     * Checks if the stack is empty.
     * This is a helper method used by other operations.
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Displays all the elements in the stack from top to bottom.
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Elements of the stack are : ");
            // Loop from the top down to the bottom of the stack.
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            // Print a newline for better formatting.
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Use Scanner for reading user input from the console.
        Scanner scanner = new Scanner(System.in);
        // Create an instance of our stack.
        StackArray stack = new StackArray();
        int option, value;

        // An infinite loop to keep the menu running until the user chooses to exit.
        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Is Empty");
            System.out.println("5. Peek");
            System.out.println("6. Exit");
            System.out.print("Enter your option : ");

            // Read the user's menu choice.
            option = scanner.nextInt();

            // A switch statement to perform an action based on the user's choice.
            switch (option) {
                case 1:
                    System.out.print("Enter element to push: ");
                    value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    // Use the boolean return value of isEmpty() for a clean check.
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 5:
                    stack.peek();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    scanner.close(); // Close the scanner to prevent resource leaks.
                    System.exit(0);  // Terminate the application.
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
