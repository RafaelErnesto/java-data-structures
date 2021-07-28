package stack;

public class Node<T>{
    Node next;
    T content;

    Node(T content) {
        this.content = content;
        this.next = null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public T getContent() {
        return content;
    }

    @Override
    public String toString() {
        return content+"";
    }
}
