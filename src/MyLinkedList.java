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
    /**
     * @function size
     * @noparams
     * @return int
     * **/
    @Override
    public int size() {
        return this.size;
    }
    /**
     * @function contains true
     * @param o
     * @return boolean
     * **/
    @Override
    public boolean contains(Object o) {
        return (indexOf(o) != -1 ? true : false);
    }
    /**
     * @function add
     * @param item
     * @return void
     * **/
    @Override
    public void add(Object item) {
        createNode((E) item);
        elements.add(item);
        size++;
    }

    private void createNode(E item) {
        Node<E> node = new Node<>(item);
        if (size == 0) {
            this.head = node;
        } else {
            node.previous = this.tail;
            this.tail.next = node;
        }
        this.tail = node;
    }

    public void add(Object item, boolean notSave) {
        createNode((E) item);
        if (notSave) elements.add(item);
        size++;
    }
    /**
     * @function add
     * @param item
     * @param index
     * @return void
     * **/
    @Override
    public void add(Object item, int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        Node oldNode = getNodeByIndex(index);
        Node node = new Node<E>((E) item);
        if (this.head.equals(oldNode)) {
            node.next = this.head;
            this.head.previous = node;
            this.head = node;
        } else if (this.tail.equals(oldNode)){
            node.next = this.tail;
            node.previous = this.tail.previous;
            this.tail.previous.next = node;
            this.tail.previous = node;
        } else {
            node.previous = oldNode.previous;
            node.next = oldNode;
            oldNode.previous.next = node;
            oldNode.previous = node;
        }
        elements.add(item, index);
        size++;
    }
    /**
     * @function remove
     * @param item
     * @return boolean
     * **/
    @Override
    public boolean remove(Object item) {
        int objIndex = indexOf(item);
        if (objIndex >= 0) {
            remove(objIndex);
            size--;
            elements.remove(objIndex);
            return true;
        }
        return false;
    }
    /**
     * @function remove
     * @param index
     * @return Object
     * **/
    @Override
    public Object remove(int index) {
        checkIndex(index);
        Node node = getNodeByIndex(index);

        if (node.previous == null) {
            this.head = node.next;
            this.head.previous = null;
        }
        else if (node.next == null) {
            this.tail = node.previous;
            this.tail.next = null;
        }
        else {
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }
        elements.remove(index);
        this.size--;
        return node.val;

    }
    /**
     * @function clear
     * @noparam
     * @return void
     * **/
    @Override
    public void clear() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    /**
     * @function get
     * @param index
     * @return E
     * **/
    @Override
    public Object get(int index) {
        checkIndex(index);
        return getNodeByIndex(index).val;
    }
    /**
     * @function indexOf
     * @param o
     * @return int
     * **/
    @Override
    public int indexOf(Object o) {
        int i = 0;
        Node<E> nextNode = this.head;
        while (nextNode != null) {
            if (this.head.val.equals(o)) return i;
            nextNode = nextNode.next;
            i++;
        }
        return -1;
    }
    /**
     * @function lastIndexOf
     * @param o
     * @return int
     * **/
    @Override
    public int lastIndexOf(Object o) {
        int i = size()-1;
        Node<E> node = this.tail;
        while (i >= 0) {
            if (node.equals(o)) return i;
            node = this.tail.previous;
            i--;
        }
        return -1;
    }
    /**
     * @function sort
     * @noparam
     * @return void
     * **/
    @Override
    public void sort() {
        try{
            Integer.valueOf((int) this.get(0));
        } catch (ClassCastException e) {
            return;
        }
        elements.sort();
        this.clear();
        for (int i = 0; i < elements.size(); i++) {
            this.add(elements.get(i), false);
        }

    }
    /**
     * @function getNodeByIndex
     * @param index
     * @return Node
     * **/
    private Node getNodeByIndex(int index) {
        checkIndex(index);
        Node toSearch;
        toSearch = this.head;
        while (index != 0) {
            toSearch = toSearch.next;
            index--;
        }
        return toSearch;
    }
    /**
     * @function checkIndex
     * @param index
     * @return void
     * **/
    private void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        String out = "[";
        Node<E> nextNode = this.head;
        while (nextNode != null) {
            out += nextNode.val + " ";
            nextNode = nextNode.next;
        }
        return out + "]";
    }
}