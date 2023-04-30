public class Main {
    public static void main(String[] args) {
        MyLinkedListStack myLinkedListStack = new <Integer>MyLinkedListStack();
        myLinkedListStack.push(1);
        myLinkedListStack.push(2);
        myLinkedListStack.push(3);
        System.out.println(myLinkedListStack.pop());
        System.out.println(myLinkedListStack.pop());
        System.out.println(myLinkedListStack.pop());
        System.out.println(myLinkedListStack.peek());
        System.out.println(myLinkedListStack.peek());
        System.out.println(myLinkedListStack.peek());
    }
}


