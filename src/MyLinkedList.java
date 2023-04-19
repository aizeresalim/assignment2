public class MyLinkedList<E> implements MyList{
    private MyArrayList elements = new MyArrayList<E>();
    private class Node<E> {
        E val;
        Node previous;
        Node next;
        public Node(E v) {
            val = v;
            previous = null;
            next = null;
        }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size;
    MyLinkedList() {
        size = 0;
    }
