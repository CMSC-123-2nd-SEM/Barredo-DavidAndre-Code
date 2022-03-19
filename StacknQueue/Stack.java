
public class Stack {
    private Node top; // node pointer for the top of the stack
    private int nodesCount; // indicator of number of items in the stack

    public Stack() {
        this.top = null; // initialized the top to be null
        this.nodesCount = 0; // initialized the number of items in stack to zero
    }

    public boolean isEmpty() {
        return top == null; // return true if the current stack has no value in it
    }

    public void Push(String data) {
        Node node = new Node(data); // pushing the input data into the node
        node.next = top; // moving the current top data to the next node
        top = node; // putting the input data to the top
        this.nodesCount += 1; // increment the size of the linked list by 1
        System.out.println("\"" + top.data + "\" has been added");
    }

    public String Pop() {
        String data;
        // Check if stack is empty
        if (isEmpty()) {
            System.out.println("The stack is empty"); // lets the user know that the stack is currently empty
            return null;
        }
        data = top.data; // initialized variable for the top value in the stack
        top = top.next; // the current top value will be the next value (value below)
        this.nodesCount -= 1; // decrement the size of the linked list by 1
        return data;// Returns the data popped out of the stack
    }

    public String Peek() {
        if (isEmpty()) { // if statement when the stack is currently empty
            System.out.println("The stack is empty"); // lets the user know that the stack is currently empty
            return null; // return the null value
        }
        return top.data; // returns the current data on top of the stack
    }

    public int Size() {
        if (isEmpty()) { // if statement when the stack is empty
            System.out.println("The stack is empty"); // lets the user know that stack is currently empty
        }
        return this.nodesCount; // return the number of values in the current stack
    }
}
