Assignment2
MyList Interface
This is the interface that MyArrayList and MyLinkedList classes implement. It defines the methods that both classes should implement.

Methods:

size(): Returns the number of elements in the list.
contains(Object o): Returns true if the list contains the specified element.
add(T item): Adds the specified element to the end of the list.
add(T item, int index): Inserts the specified element at the specified position in the list.
remove(T item): Removes the first occurrence of the specified element from the list, if it is present.
remove(int index): Removes the element at the specified position in the list.
clear(): Removes all elements from the list.
get(int index): Returns the element at the specified position in the list.
indexOf(Object o): Returns the index of the first occurrence of the specified element in the list, or -1 if the list does not contain the element.
lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in the list, or -1 if the list does not contain the element.
sort(): Sorts the elements in the list in ascending order.
MyArrayList Class
This class implements the MyList interface and provides an implementation of an ArrayList.

Instance Variables:

Object[] elements: An array that holds the elements of the list.
int size: The number of elements in the list.
Methods:

MyArrayList(): Constructor that creates a new MyArrayList object.
size(): Returns the number of elements in the list.
contains(Object o): Returns true if the list contains the specified element.
add(T item): Adds the specified element to the end of the list. If the array is full, creates a new array with double the size of the original array, copies over the elements from the original array, and then adds the new element.
add(T item, int index): Inserts the specified element at the specified position in the list. If the array is full, creates a new array with double the size of the original array, copies over the elements from the original array, and then inserts the new element at the specified index.
remove(T item): Removes the first occurrence of the specified element from the list, if it is present. Shifts all subsequent elements to the left by one position.
remove(int index): Removes the element at the specified position in the list. Shifts all subsequent elements to the left by one position.
clear(): Removes all elements from the list.
get(int index): Returns the element at the specified position in the list.
indexOf(Object o): Returns the index of the first occurrence of the specified element in the list, or -1 if the list does not contain the element.
lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in the list, or -1 if the list does not contain the element.
sort(): Sorts the elements in the list in ascending order.

MyLinkedList Class
This class implements the MyList interface and provides an implementation of a LinkedList.

Inner Class:

Node<E>: A private inner class that represents a node in the linked list. It contains an element of type E and references to the next and previous nodes in the list.
Instance Variables:

Node<E> head: A reference to the first node in the list.
Node<E> tail: A reference to the last node in the list.
int size: The number of elements in the list.
Methods:

MyLinkedList(): Constructor that creates a new MyLinkedList object.
size(): Returns the number of elements in the list.
contains(Object o): Returns true if the list contains the specified element.

(T item): Adds the specified element to the end of the list.
add(T item, int index): Adds the specified element at the specified index in the list.
remove(T item): Removes the first occurrence of the specified element from the list, if it is present.
remove(int index): Removes the element at the specified index in the list.
clear(): Removes all elements from the list.
get(int index): Returns the element at the specified index in the list.
indexOf(Object o): Returns the index of the first occurrence of the specified element in the list, or -1 if it is not present.
lastIndexOf(Object o): Returns the index of the last occurrence of the specified element in the list, or -1 if it is not present.
sort(): Sorts the elements in the list in ascending order according to their natural ordering or using a comparator if provided.

