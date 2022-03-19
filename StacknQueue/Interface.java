import java.util.Scanner;
import java.util.regex.Pattern;

public class Interface {
    Scanner scanner; // calls for the scanner
    Stack stack; // calls for the stack from Stack.java
    Queue queue; // calls for the queue from Queue.java

    public Interface(Queue queue, Stack stack) { // Constructor for called out variables
        this.stack = stack;
        this.queue = queue;
        scanner = new Scanner(System.in);
    }

    public void stackInterface() {
        boolean exitStack = true; // variable for behavior of while loop for user
        while (exitStack) {
            System.out.println("******************************************");
            System.out.println("*  Stack Operations                      *");
            System.out.println("*  1. Push                               *");
            System.out.println("*  2. Pop                                *");
            System.out.println("*  3. Peek                               *");
            System.out.println("*  4. Size                               *");
            System.out.println("*  5. Exit                               *");
            System.out.println("******************************************");
            System.out.println("Choose an option [1-5] :");
            int optionStack; // variable for user option in Stack 

            while (!scanner.hasNextInt()) {
                System.out.println("I don't quinte understand that."); // lets the user know that the inputted value is wrong
                scanner.next();
            }
            optionStack = scanner.nextInt(); // scans user desired option
            scanner.nextLine();

            switch (optionStack) {
                case 1:
                    System.out.print("Enter a string to add:");

                    String data = scanner.nextLine(); // String the user wants to add
                    stack.Push(data); // pushes the data into the Push function in Stack.Java
                    break;
                case 2:
                    System.out.println("Confirm to Pop? Y/N"); // Asks the user for confirmation 
                    String input = scanner.nextLine();
                    while (!Pattern.matches("[Nn]{1}", input)) { // While loop for yes answer of the user
                        if (Pattern.matches("[Yy]{1}", input)) {
                            String tempStr1 = stack.Pop(); // calls the Pop function in Stack.java
                            if (tempStr1 != null) {
                                System.out.println("\"" + tempStr1 + "\" has been Popped out of the stack"); // lets the user know the value that has been popped out of the stack
                            }
                            break;
                        } else {
                            System.out.println("I don't quinte understand that."); 
                        }
                        input = scanner.nextLine();
                    }

                    break;
                case 3:
                    if (stack.Peek() != null) {
                        System.out.println("\"" + stack.Peek() + "\" is on top of the stack"); // lets the user know the current value on top  of the stack
                    }

                    break;
                case 4:
                    System.out.println("The size of the stack is " + stack.Size()); // lets the user know the current size of the linked list
                    break;
                case 5:
                    exitStack = false; 
                    System.out.println("Returning..."); // for termination of the while loop
                    break;
            }
        }
    }

    public void queueInterface() {
        boolean exitQueue = true; // variable for the while loop behavior for the user
        while (exitQueue) {
            System.out.println("******************************************");
            System.out.println("*  Stack Operations                      *");
            System.out.println("*  1. Enqueue                            *");
            System.out.println("*  2. Dequeue                            *");
            System.out.println("*  3. Print                              *");
            System.out.println("*  4. Exit                               *");
            System.out.println("******************************************");
            System.out.println("Choose an option [1-4] :");
            int optionStack;

            while (!scanner.hasNextInt()) {
                System.out.println("I don't quinte understand that."); // lets the user know that the inputted value is wrong
                scanner.next();
            }
            optionStack = scanner.nextInt(); // user input for their choice 
            scanner.nextLine();

            switch (optionStack) {
                case 1:
                    System.out.print("Enter a string to add:");
                    String data = scanner.nextLine();
                    queue.Enqueue(data); // Enqueues the user input into the Queue
                    break;
                case 2:
                    System.out.println("Confirm to Dequeue? Y/N"); // Asks user confirmation to Dequeue
                    String input = scanner.nextLine();
                    while (!Pattern.matches("[Nn]{1}", input)) { // While loop after user confirms to dequeue
                        if (Pattern.matches("[Yy]{1}", input)) {
                            String tempStr = queue.Dequeue(); // calls the Dequeue function in Queue.java and gets the dequeued data
                            if (tempStr != null) {
                                System.out.println("\"" + tempStr + "\" has been Dequeued"); // show user the dequeued data
                            }
                            break;
                        } else {
                            System.out.println("I don't quinte understand that.");
                        }
                        input = scanner.nextLine();
                    }
                    break;
                case 3:
                    String tempStr = queue.toString(); // calls toString function in Queue.java
                    if (tempStr != null) {
                        System.out.println(tempStr); // prints the current queue 
                    }
                    break;
                case 4: // terminates the while loop
                    exitQueue = false;
                    System.out.println("Returning...");
                    break;
            }
        }
    }
}
