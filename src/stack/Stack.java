package stack;

public class Stack {
    Node top;

    Stack() {
        this.top = null;
    }

    public void push(Node newNode) {
        newNode.setNext(top);
        top = newNode;
    }

    public Node top() {
        return top;
    }

    private boolean isEmpty()
    {
        return top == null;
    }

    public Node pop() {
        if(this.isEmpty()) {
            return null;
        }

        Node lastTop = top;
        top = lastTop.getNext();
        return lastTop;
    }

    @Override
    public String toString() {
        if(this.isEmpty()) {
            return "The stack is empty";
        }

        Node currentNode = top;
        String resultString = "Stack Nodes: \n";

        do{
            resultString += currentNode.getContent() + "\n";
            currentNode = currentNode.getNext();
        }while(currentNode != null);

        return resultString;
    }
}
