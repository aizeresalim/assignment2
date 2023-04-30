public class Main {
    public static void main(String[] args) {
        //      ## MyLinkedListStack
        System.out.println("MyLinkedListStack");
        MyLinkedListStack myLinkedListStack = new <Integer>MyLinkedListStack();
        myLinkedListStack.push(1);
        myLinkedListStack.push(2);
        myLinkedListStack.push(3);
        System.out.println(myLinkedListStack.pop());
        System.out.println(myLinkedListStack.pop());
        System.out.println(myLinkedListStack.peek());

        //      ## MyLinkedListQueue
        System.out.println("MyLinkedListQueue");
        MyLinkedListQueue myLinkedListQueue = new <Integer>MyLinkedListQueue();
        myLinkedListQueue.enqueue(1);
        myLinkedListQueue.enqueue(2);
        myLinkedListQueue.enqueue(3);
        System.out.println(myLinkedListQueue.dequeue());
        System.out.println(myLinkedListQueue.dequeue());
        System.out.println(myLinkedListQueue.peek());


//      ## MyLinkedListQueue
        System.out.println("MyArrayListStack");
        MyLinkedListQueue myLinkedListQueue = new <Integer>MyLinkedListQueue();
        myLinkedListQueue.enqueue(1);
        myLinkedListQueue.enqueue(2);
        myLinkedListQueue.enqueue(3);
        System.out.println(myLinkedListQueue.dequeue());
        System.out.println(myLinkedListQueue.dequeue());
        System.out.println(myLinkedListQueue.peek());
    }
}


