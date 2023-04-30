import java.util.EmptyStackException;

public class MyLinkedListStack<T> {

    MyLinkedList myLinkedList = new <T>MyLinkedList();
    MyLinkedListStack() {}
    public void push(T element){
        myLinkedList.add(element, 0);
    }
}
