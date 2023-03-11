package lab5;
public class Ex5_2 <E>{


    private Ex5_2.Node<E> head;

    Node<E> x;

    private int size;
    CircularDoublyLinkedList<E> z=new CircularDoublyLinkedList<>();

    public  boolean equals(Object other) {


        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Ex5_2<E> that = (Ex5_2<E>) other;
        if (z.size() != that.z.size()) {
            return false;

        }
        Node<E> thisNode = head;
        Node<?> thatNode = that.head;
        for (int i = 0; i < size; i++) {
            if (!x.getElement().equals(thatNode.getElement())) {
                return false;
            }

        }
        return true;
    }
    private static class Node<E> {
        E element;



        Ex5_2.Node<E> prev;
        Ex5_2.Node<E> next;



        E data;
        Node(E data) {
            this.prev = null;
            this.next = null;
            this.data = data;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

    }
}
