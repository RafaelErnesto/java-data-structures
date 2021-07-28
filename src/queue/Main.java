package queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.enqueue(new Node("first"));
        myQueue.enqueue(new Node("second"));
        myQueue.enqueue(new Node("third"));
        System.out.println(myQueue.toString());
        myQueue.dequeue();
        System.out.println(myQueue.toString());
    }
}
