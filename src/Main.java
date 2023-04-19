import java.util.Scanner;

public class Main {
    public static void showcaseArrayList(){
        Scanner sc = new Scanner(System.in);
        MyArrayList myArrayListInt = new MyArrayList<Integer>();
        System.out.println("Let's start fromMyArrayList<Integer>:");
        System.out.println("> Size: " + myArrayListInt.size());
        System.out.println("let's add elements <Integer>:");
        System.out.println("Enter -1 ");
        int nextInt;
        while(true) {
            nextInt = sc.nextInt();
            if (nextInt == -1) break;
            myArrayListInt.add(nextInt);
        }
        System.out.println("> Your array: " + myArrayListInt);
        System.out.println("> Size: " + myArrayListInt.size());

        System.out.println("Add index. Add index and element:");
        nextInt = sc.nextInt();
        int nextIndex = sc.nextInt();
        myArrayListInt.add(nextInt, nextIndex);

        System.out.println("Let's delete element with index. Enter:");
        nextIndex = sc.nextInt();
        myArrayListInt.remove(nextIndex);
        System.out.println("> Your array: " + myArrayListInt);

        System.out.println("Now delete element without index. Enter number:");
        nextInt = sc.nextInt();
        myArrayListInt.remove((Object) nextInt);
        System.out.println("> Your array: " + myArrayListInt);

        System.out.println("Let's check Is this element in array?");
        nextInt = sc.nextInt();
        System.out.println(myArrayListInt.contains(nextInt));

        System.out.println("And now let's find out the first index of the occurrence of the element you entered in the array");
        nextInt = sc.nextInt();
        System.out.println(myArrayListInt.indexOf(nextInt));

        System.out.println("And now let's find out the last index of the occurrence of the element you entered in the array");
        nextInt = sc.nextInt();
        System.out.println(myArrayListInt.lastIndexOf(nextInt));
    }

    public static void showCaseLinkedNode(){
        Scanner sc = new Scanner(System.in);
        MyLinkedList myLinkedList = new MyLinkedList<Integer>();
        System.out.println(" Lets start fromMyLinkedList<Integer>:");
        System.out.println("> Size: " + myLinkedList.size());
        System.out.println("lets add element <Integer>:");
        System.out.println("enter -1");
        int nextInt;
        while(true) {
            nextInt = sc.nextInt();
            if (nextInt == -1) break;
            myLinkedList.add(nextInt);
        }
        System.out.println("> Size: " + myLinkedList.size());

        System.out.println("Let's add an element at index. Enter the element and index separated by a space:");
        nextInt = sc.nextInt();
        int nextIndex = sc.nextInt();
        myLinkedList.add(nextInt, nextIndex);

        System.out.println("Let's remove the element at your index. Enter it:");
        nextIndex = sc.nextInt();
        myLinkedList.remove(nextIndex);
        System.out.println("> Your array: " + myLinkedList);

        System.out.println("And now we will remove the element without knowing its index. Enter number to delete:");
        nextInt = sc.nextInt();
        myLinkedList.remove((Object) nextInt);
        System.out.println("> Your array: " + myLinkedList);

        System.out.println("Now let's find out if the element you entered is in the linked node?");
        nextInt = sc.nextInt();
        System.out.println(myLinkedList.contains(nextInt));

        System.out.println("And now let's find out the first index of the occurrence of the element you entered in the linked node");
        nextInt = sc.nextInt();
        System.out.println(myLinkedList.indexOf(nextInt));

        System.out.println("And now let's find out the last index of the occurrence of the element you entered in the linked node");
        nextInt = sc.nextInt();
        System.out.println(myLinkedList.lastIndexOf(nextInt));
    }


    public static void main(String[] args) {
//        showcaseArrayList();
        showCaseLinkedNode();

    }
}

