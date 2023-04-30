import jdk.nio.mapmode.ExtendedMapMode;

import java.util.EmptyStackException;

public class MyLinkedListStack<T> {
    MyLinkedList myLinkedList = new <T>MyLinkedList();
    MyLinkedListStack() {}
    public void push(T element){
        myLinkedList.add(element, 0);
    }
    public T pop() {
        isEmpty();
        return (T) myLinkedList.remove(0);
    }
    public T peek() {
        isEmpty();
        return (T) myLinkedList.get(0);
    }
    private void isEmpty() {
        if (myLinkedList.size() == 0) throw new EmptyStackException();
    }
}