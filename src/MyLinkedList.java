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

    /**
     * @function size возвращает длину LinkedList
     * @noparams
     * @return int
     * **/
    @Override
    public int size() {
        return this.size;
        @@ -46,10 +50,32 @@ public void add(Object item) {
            this.tail = node;
            size++;
        }

        /**
         * @function add добавляет объект на определенный индекс
         * @param item объект для добавления
         * @param index индекс куда нужно добавить item
         * @return void
         * **/
        @Override
        public void add(Object item, int index) {

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
            size++;
        }

        @Override
        @@ -64,7 +90,7 @@ public boolean remove(Object item) {
            @Override
            public Object remove(int index) {
                checkIndex(index);
                Node node = findIndexedNode(index);
                Node node = getNodeByIndex(index);

                if (node.previous == null) {
                    this.head = node.next;
                    @@ -102,7 +128,7 @@ public void clear() {
                        @Override
                        public Object get(int index) {
                            checkIndex(index);
                            return findIndexedNode(index).val;
                            return getNodeByIndex(index).val;
                        }

                        @Override
                        @@ -119,7 +145,7 @@ public int lastIndexOf(Object o) {
                            public void sort() {

                            }
                            private Node findIndexedNode(int index) {
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
                                private void checkIndex(int index){
                                    if(index < 0 || index>=size){
                                        throw new IndexOutOfBoundsException();
                                    }
                                }
                            }