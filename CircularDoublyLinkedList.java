package lab5;

public class CircularDoublyLinkedList<E>{
    private Node<E> head;
    private int size;


    public CircularDoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public <E> E first() {
        if (isEmpty()) {
            return null;
        }
        return (E) head.data;
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return head.prev.data;
    }

    public void addFirst(E data) {
        Node<E> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            head.prev = head;
            head.next = head;
        } else {
            newNode.prev = head.prev;
            newNode.next = head;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(E data) {
        Node<E> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            head.prev = head;
            head.next = head;
        } else {
            newNode.prev = head.prev;
            newNode.next = head;
            head.prev.next = newNode;
            head.prev = newNode;
        }
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E data = head.data;
        if (size == 1) {
            head = null;
        } else {
            head.prev.next = head.next;
            head.next.prev = head.prev;
            head = head.next;
        }
        size--;
        return data;
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        E data = head.prev.data;
        if (size == 1) {
            head = null;
        } else {
            head.prev.prev.next = head;
            head.prev = head.prev.prev;
        }
        size--;
        return data;
    }

    public void rotate() {
        if (!isEmpty()) {
            head = head.next;
        }
    }

    public void rotateBackward() {
        if (!isEmpty()) {
            head = head.prev;
        }
    }


    private static class Node<E> {
        Node<E> prev;
        Node<E> next;
        E data;
        Node(E data) {
            this.prev = null;
            this.next = null;
            this.data = data;
        }
    }

}
