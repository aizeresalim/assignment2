import java.util.EmptyStackException;

import java.util.EmptyStackException;

public class MyArrayListStack<T> {
    MyArrayList myArrayList = new <T>MyArrayList();

    MyArrayListStack() {}

    public void push(T element) {
        myArrayList.add(element, 0);
    }


