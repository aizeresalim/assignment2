import java.util.EmptyStackException;

import java.util.EmptyStackException;

public class MyArrayListStack<T> {
    MyArrayList myArrayList = new <T>MyArrayList();

    MyArrayListStack() {}

    public void push(T element) {
        myArrayList.add(element, 0);
    }
    public T pop() {
        isEmptyThrowException();
        return (T) myArrayList.remove(0);
    }

    public T peek() {
        isEmptyThrowException();
        return (T) myArrayList.get(0);
    }
    public int size() {
        return myArrayList.size();
    }
    private void isEmptyThrowException() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }
}

