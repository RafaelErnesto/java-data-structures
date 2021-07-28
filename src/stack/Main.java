package stack;

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(new Node("Apple"));
        myStack.push(new Node("Banana"));
        myStack.push(new Node("Avocado"));
        myStack.push(new Node("Grape"));
        myStack.push(new Node("Strawberry"));
        System.out.println(myStack.toString());

        myStack.pop();
        System.out.println(myStack.toString());

    }
}
