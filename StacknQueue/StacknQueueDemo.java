import java.util.Scanner;

public class StacknQueueDemo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in); // calls for the scanner
        Stack stack = new Stack(); // calls and stores Stack.java
        Queue queue = new Queue(); // calls and stores Queue.java
        Interface interface1 = new Interface(queue, stack); // calls and store Interface.java
        boolean exit = false; // variable for while loop exit

        while (!exit) {
            System.out.println("******************************************");
            System.out.println("*  Welcome to our StacknQueueDemo:       *");
            System.out.println("*  1. Stack                              *");
            System.out.println("*  2. Queue                              *");
            System.out.println("*  3. Exit                               *");
            System.out.println("******************************************");
            System.out.println("Choose an option [1-3] :");
            int option; // variable for user option
            while (!scanner.hasNextInt()) {
                System.out.println("I don't quinte understand that."); // lets the user know that the inputted value is wrong
                scanner.next();
            }
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    interface1.stackInterface(); // calls the stackInterface function from Interface.java
                    break;
                case 2:
                    interface1.queueInterface(); // calls the queueInterface function from Interface.java
                    break;
                case 3: // terminates the while loop
                    System.out.println("Thank you for trying out our demo!");
                    scanner.close();
                    exit = true;
                    break;
            }
        }
    }
}