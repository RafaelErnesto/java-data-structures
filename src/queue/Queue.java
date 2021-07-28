package queue;

public class Queue {
    private Node tail;
    private Node head;

    Queue() {
        this.tail = null;
        this.head = null;
    }

    public void enqueue(Node newNode) {
        if(this.isEmpty()) {
            head = newNode;
        }
        newNode.setNext(tail);
        tail = newNode;
    }

    public Node dequeue() {
        if(this.isEmpty()) return null;

        Node currentNode = tail;

        if(tail == head) {
            tail = null;
            head = null;
            return currentNode;
        }

        do{
            if(currentNode.getNext() == head) {
                head = currentNode;
                currentNode.setNext(null);
                return currentNode.getNext();
            } else {
                currentNode = currentNode.getNext();
            }
        }while(currentNode != head);

        return null;
    }

    public Node first() {
        return head;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    @Override
    public String toString() {
        if(this.isEmpty()) {
            return "The queue is empty!";
        }

        String result = "Queue nodes: \n";
        Node currentNode = tail;

        do{
            result+= currentNode.getContent()+"\n";
            currentNode = currentNode.getNext();
        } while(currentNode != null);

        return result;
    }
}
