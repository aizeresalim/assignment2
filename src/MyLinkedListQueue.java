import java.util.NoSuchElementException;

public class MyLinkedListQueue<T> {
    MyLinkedList myLinkedList = new <T>MyLinkedList();

    MyLinkedListQueue() {
    }

    public void enqueue(T element) {
        myLinkedList.add(element);
    }

    public T dequeue() {
        return (T) myLinkedList.remove(0);
    }

    public T pop() {
        isEmptyThrowException();
        return (T) myLinkedList.remove(0);
    }

    public T peek() {
        isEmptyThrowException();
        return (T) myLinkedList.get(0);
    }

    public int size() {
        return myLinkedList.size();
    }

    private void isEmptyThrowException() throws NoSuchFieldException {
        if (isEmpty()) {
            throw new NoSuchFieldException();
        }
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }
}
