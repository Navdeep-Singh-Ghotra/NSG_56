public class LinkedStackOfStrings {
    private Node first; // top of stack (most recently added node)

    private class Node {
        String item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(String item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    public String pop() {
        if (isEmpty())
            throw new RuntimeException("Stack underflow");
        String item = first.item;
        first = first.next;
        return item;
    }

}
