public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList<Integer>();
        Integer[] e1 = new Integer[]{1,2,3};
        Integer[] e2 = new Integer[]{4,5,6};
        Integer[] e3 = new Integer[]{7,8,9};
        myArrayList.addAllByIndex(e1, 0);
        myArrayList.addAllByIndex(e2, 1);
        myArrayList.addAllByIndex(e3, 2);
        System.out.println(myArrayList);
        MyLinkedListStack myLinkedListStack = new <Integer>MyLinkedListStack();
        myLinkedListStack.push(1);
        myLinkedListStack.push(2);
        myLinkedListStack.push(3);
    }
}
