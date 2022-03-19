
public class Queue {
    // Initialize needed variables
    private Node front, rear;

    // Constructor to intialize to null
    public Queue() {
        this.front = this.rear = null;
    }

    // Adding to Queue
    public void Enqueue(String data) {
        // Create New Node to be added
        Node node = new Node(data);

        // Check if Node is empty
        if (this.rear == null) {
            this.front = this.rear = node;
            return;
        }

        // Assign new node behind the queue
        this.rear.next = node;
        // Reassign previous queue infront of new node
        this.rear = node;
        System.out.println("\"" + data + "\" has been queued");
    }

    public String Dequeue() {

        // Check if queue is empty
        if (this.front == null) {
            System.out.println("Queue is Empty");
            return null;
        }

        // Store previous front in temp node
        Node node = this.front;

        // Move one node ahead
        this.front = this.front.next;

        // Check if queue is empty and assign rear to null
        if (this.front == null) {
            this.rear = null;
        }

        return node.data;
    }

    public String toString() {
        // Initialize return variable
        String results = "";
        // Store front in temp node
        Node node = front;

        if (front == null) {
            System.out.println("Queue is empty");
            return null;
        }

        // If head is not null, then store data into results
        while (node != null) {
            results += node.data;
            // If there is a next node
            if (node.next != null) {
                results += ", ";
            }
            // Traverse the list
            node = node.next;
        }

        return results;
    }
}
