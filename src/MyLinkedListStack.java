import jdk.nio.mapmode.ExtendedMapMode;
import java.util.EmptyStackException;
public class MyLinkedListStack<T> {

    MyLinkedList myLinkedList = new <T>MyLinkedList();


        MyLinkedListStack() {
        }

        public void push(T element) {
            myLinkedList.add(element, 0);
        }

        public T pop() {

            isEmptyThrowException();
            return (T) myLinkedList.remove(0);
        }

        public T peek() {
        
            isEmptyThrowException();
            return (T) myLinkedList.get(0);
        }
        private void isEmpty() {
            if (myLinkedList.size() == 0) throw new EmptyStackException();

            private void isEmptyThrowException() {
                if (isEmpty()) {
                    throw new EmptyStackException();
                }
            }

            public boolean isEmpty() {
                return myLinkedList.size() == 0;
            }
        }