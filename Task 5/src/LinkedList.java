import java.util.NoSuchElementException;

public class LinkedList<E> {
    private class Node {
        public Node(E value) {
            this.value = value;
        }

        E value;
        Node nextNode;
    }

    private Node head;
    private Node tail;
    private int size;

    private boolean isEmpty() {
        return head == null;
    }

    //O(1)
    public void addFirst(E item) {
        Node node = new Node(item);
        if (isEmpty())
            head = tail = node;
        else {
            node.nextNode = head;

            head = node;
        }
        size++;

    }

    //O(1)
    public void addLast(E item) {
        Node node = new Node(item);
        if (isEmpty())
            head = tail = node;
        else {
            tail.nextNode = node;
            tail = node;
        }
        size++;
    }

    //O(1)
    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException("empty list");
        if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            head = head.nextNode;
            temp.nextNode = null;
        }
        size--;
    }

    //O(n)
    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException("empty list");
        if (head == tail) {
            head = tail = null;
        } else {
            Node beforeLast = getBeforeLast();
            tail = beforeLast;
            tail.nextNode = null;
        }
        size--;
    }

    private Node getBeforeLast() {
        Node beforeLast = head;
        Node current = head;
        while (current.nextNode != null) {
            beforeLast = current;
            current = current.nextNode;
        }
        return beforeLast;
    }

    //O(n)
    public int indexOf(E item) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == item)
                return index;
            index++;
            current = current.nextNode;
        }
        return -1;
    }

    //O(n)
    public boolean contains(E value) {
        int index = indexOf(value);
        return index != -1;
    }

    //O(1)
    public int size() {
        return size;
    }

    public void reverse() {
        Node previous = head;
        Node current = head.nextNode;
        while (current != null) {
            Node follow = current.nextNode;
            current.nextNode = previous;
            previous = current;
            current = follow;
        }
        Node temp = head;
        head = tail;
        tail = temp;
        tail.nextNode = null;
    }

    //O(n)
    public void printElements() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.nextNode;
        }
        System.out.println();
    }

}
