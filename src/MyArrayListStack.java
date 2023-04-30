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


