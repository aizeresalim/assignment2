public class MyLinkedList<E> implements MyList{
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
    @Override
    public int size() {
        return this.size;
    }
    @Override
    public boolean contains(Object o) {
        return false;
    }
    /**
     * @function add добавляет объект в LinkedList
     * @param item объект для добавления
     * @return void
     * **/
    @Override
    public void add(Object item) {
        Node<E> node = new Node<>((E) item);
        if (size == 0) {
            this.head = node;
        } else {
            node.previous = this.tail;
            this.tail.next = node;
        }
        this.tail = node;
        size++;
    }
    @Override
    public void add(Object item, int index) {
    }
    @Override
    public boolean remove(Object item) {
        return false;
    }
    @Override
    public Object remove(int index) {
        return null;
    }
    @Override
    public void clear() {
    }

    @Override
    public Object get(int index) {
        return null;
        Node toSearch;
        toSearch = this.head;
        while (index != 0) {
            toSearch = toSearch.next;
            index--;
        }
        return (E) toSearch.val;



    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }
    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }
    @Override
    public void sort() {
    }
}