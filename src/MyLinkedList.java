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

    @@ -31,7 +32,15 @@ public boolean contains(Object o) {

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