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
     * @function increaseBufferIfNeeded увеличиваем буфер массива
     * @noparams
     **/
    public void increaseBufferIfNeeded() {
        if (size == arr.length) {
            T[] newArr = (T[]) new Object[arr.length * 5];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }

    /**
     * @return int
     * @function size выдает длину массива
     * @noparams
     **/
    @Override
    public int size() {
        return this.size;
    }

    /**
     * @param o объект поиска
     * @return boolean
     * @function contains true если Object o в массиве
     **/
    @Override
    public boolean contains(Object o) {
        for (T element : arr) {
            if (o.equals(element)) return true;
        }
        return false;
    }

    /**
     * @param item объект для добавления
     * @return void
     * @function add добавляет объект в массив
     **/
    @Override
    public void add(Object item) {
        increaseBufferIfNeeded();
        arr[size++] = (T) item;
    }

    /**
     * @param item  объект для добавления
     * @param index индекс куда нужно добавить item
     * @return void
     * @function add добавляет объект на определенный индекс
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
     * @param item объект удаления
     * @return boolean
     * @function remove удаляет объект из массива
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
     * @param index индекст элемента для удаления
     * @return Object
     * @function remove удаляет объект из массива
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
     * @function clear очищает массив
     * @noparam
     **/
    public void clear() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    /**
     * @param index индекс объекта
     * @return Object
     * @function get возвращает объект из массива под его индексом
     **/
    @Override
    public Object get(int index) {
        checkIndex(index);
        return arr[index];
    }

    /**
     * @param o объект для поиска
     * @return int
     * @function indexOf возвращает индекс первого вхождения объекта
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
     * @param o объект для поиска
     * @return int
     * @function lastIndexOf возвращает индекс последнего вхождения объекта в массив
     **/
    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) if (arr[i].equals((T) o) && i > index) index = i;
        return index;
    }

    /**
     * @return void
     * @function sort сортирует массив (bubble sort, O(n^2))
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
     * @param index индекс
     * @return void
     * @function checkIndex проверяет индекс на его валидность в рамках структуры данных
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

    public void addAllByIndex(T[] elements, int index) {
        increaseBufferIfNeeded();
        T[] left = (T[]) new Object[arr.length + elements.length];
        for (int i = 0; i < index; i++) {
            left[i] = arr[i];
        }
        int j = 0;
        for (int i = index; i < index + elements.length; i++) {
            left[i] = (T) elements[j++];
        }
        for (int i = index; i < size; i++) {
            for (int i = index; i < this.size; i++) {
                left[++j] = arr[index];
            }
            this.size += elements.length;
            this.arr = left;
        }
    }





