import java.util.Arrays;

public class MyArrayList<T> implements MyList {
    private T[] arr;
    private int size;
    /**
     * @function constructor
     * @noparam
     * @return void
     **/
    MyArrayList(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    /**
     * @function increaseBufferIfNeeded
     * @noparams
     * @return void
     * **/
    public void increaseBufferIfNeeded(){
        if(size == arr.length){
            T[] newArr = (T[]) new Object[arr.length*2];
            for(int i=0; i< arr.length; i++){
                newArr[i]=arr[i];
            }
            arr = newArr;
        }
    }
    /**
     * @function size
     * @noparams
     * @return int
     * **/
    @Override
    public int size() {
        return this.size;
    }
    /**
     * @function contains true
     * @param o
     * @return boolean
     * **/
    @Override
    public boolean contains(Object o) {
        for(T element : arr) {
            if (o.equals(element)) return true;
        }
        return false;
    }
    /**
     * @function add
     * @param item
     * @return void
     * **/
    @Override
    public void add(Object item) {
        increaseBufferIfNeeded();
        arr[size++] = (T) item;
    }
    /**
     * @function add
     * @param item
     * @param index
     * @return void
     * **/
    @Override
    public void add(Object item, int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        increaseBufferIfNeeded();
        for(int i = size; i>index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = (T) item;
        size++;
    }
    /**
     * @function remove
     * @param item
     * @return boolean
     * **/
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
     * @function remove
     * @param index
     * @return Object
     * **/
    @Override
    public Object remove(int index) {
        checkIndex(index);
        T temporary = this.arr[index];
        for(int i= index + 1; i<=size; i++){
            arr[i-1] = arr[i];
        }
        this.size--;
        return temporary;
    }
    /**
     * @function clear
     * @noparam
     * @return void
     * **/
    public void clear(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    /**
     * @function get
     * @param index
     * @return Object
     * **/
    @Override
    public Object get(int index) {
        checkIndex(index);
        return arr[index];
    }
    /**
     * @function indexOf
     * @param o
     * @return int
     * **/
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
     * @function lastIndexOf
     * @param o
     * @return int
     * **/
    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) if (arr[i].equals((T) o) && i > index) index = i;
        return index;
    }
    /**
     * @function sort
     * @noparam
     * @return void
     * **/
    @Override
    public void sort() {
        try{
            Integer.valueOf((int) this.get(0));
        } catch (ClassCastException e) {
            return;
        }
        for(int i = 0; i < size; i++) {
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
     * @function checkIndex
     * @param index
     * @return void
     * **/
    private void checkIndex(int index){
        if(index < 0 || index>=size){
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);

    }
}