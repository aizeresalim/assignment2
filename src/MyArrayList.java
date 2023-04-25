import java.util.ArrayList;
import java.util.Arrays;


public class MyArrayList<T> implements MyList {
    private T[] arr;
    private int size;

    /**
     * @return void
     * @function constructor
     * @noparam
     **/
    MyArrayList() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    /**
     * @return void
     * @function increaseBufferIfNeeded
     * @noparams
     **/
    public void increaseBufferIfNeeded() {
        if (size == arr.length) {
            T[] newArr = (T[]) new Object[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }

    /**
     * @return int
     * @function size
     * @noparams
     **/
    @Override
    public int size() {
        return this.size;
    }

    /**
     * @param o
     * @return boolean
     * @function contains true
     **/
    @Override
    public boolean contains(Object o) {
        for (T element : arr) {
            if (o.equals(element)) return true;
        }
        return false;
    }

    /**
     * @param item
     * @return void
     * @function add
     **/
    @Override
    public void add(Object item) {
        increaseBufferIfNeeded();
        arr[size++] = (T) item;
    }

    /**
     * @param item
     * @param index
     * @return void
     * @function add
     **/
    @Override
    public void add(Object item, int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        increaseBufferIfNeeded();
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = (T) item;
        size++;
    }

    /**
     * @param item
     * @return boolean
     * @function remove
     **/
    // Complexity: 0(n^2)
    @Override
    public boolean remove(Object item) {
        int index = indexOf(item);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }

    /**
     * @param index
     * @return Object
     * @function remove
     **/
    @Override
    public Object remove(int index) {
        checkIndex(index);
        T temporary = this.arr[index];
        for (int i = index + 1; i <= size; i++) {
            arr[i - 1] = arr[i];
        }
        this.size--;
        return temporary;
    }

    /**
     * @return void
     * @function clear
     * @noparam
     **/
    public void clear() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    /**
     * @param index
     * @return Object
     * @function get
     **/
    @Override
    public Object get(int index) {
        checkIndex(index);
        return arr[index];
    }

    /**
     * @param o
     * @return int
     * @function indexOf
     **/
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals((T) o)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param o
     * @return int
     * @function lastIndexOf
     **/
    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) if (arr[i].equals((T) o) && i > index) index = i;
        return index;
    }

    /**
     * @return void
     * @function sort
     * @noparam
     **/
    @Override
    public void sort() {
        try {
            Integer.valueOf((int) this.get(0));
        } catch (ClassCastException e) {
            return;
        }
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if ((int) arr[j] < (int) arr[i]) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * @param index
     * @return void
     * @function checkIndex
     **/
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);

    }

    public void removeDuplicates() {

        ArrayList<T> newList = new ArrayList<T>();


        for (int i = 0; i < size; i++) {
            T element = arr[i];


            if (!newList.contains(element)) {
                newList.add(element);
            }
        }


        arr = (T[]) new Object[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            arr[i] = newList.get(i);
        }
        size = newList.size();
    }
}





