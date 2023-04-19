public class MyArrayList<T> implements MyList {
    private T[] arr;
    private int size;
    MyArrayList(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    public void increaseBuffer(){
        T[] newArr = (T[]) new Object[arr.length*2];
        for(int i=0; i< arr.length; i++){
            newArr[i]=arr[i];
            public void increaseBufferIfNeeded(){
                if(size == arr.length){
                    T[] newArr = (T[]) new Object[arr.length*2];
                    for(int i=0; i< arr.length; i++){
                        newArr[i]=arr[i];
                    }
                    arr = newArr;
                }
                arr = newArr;
            }

            public T getElement(int index) {
                checkIndex(index);
                return arr[index];
            }

            public int getSize() {
                return size;
            }

            @Override
            public int size() {
                return 0;
                return this.size;
            }

            @Override
            public boolean contains(Object o) {
                for(T element : arr) {
                    if (o.equals(element)) return true;
                }
                return false;
            }

            @Override
            public void add(Object item) {
                if(size == arr.length){
                    increaseBuffer();
                }
                increaseBufferIfNeeded();
                arr[size++] = (T) item;
            }
            @Override
            public void add(Object item, int index) {

                checkIndex(index);
                increaseBufferIfNeeded();
                for(int i = size; i>index; i--) {
                    arr[i] = arr[i-1];
                }
                arr[index] = (T) item;
                size++;
            }

            // 0(n^2)
            @Override
            public boolean remove(Object item) {
                int index = indexOf(item);
                if (index >= 0) {
                    remove(index);
                    return true;
                }
                return false;
            }

            @Override
            public Object remove(int index) {
                return null;
                checkIndex(index);
                T temporary = this.arr[index];
                for(int i= index + 1; i<size; i++){
                    arr[i-1] = arr[i];
                }
                this.size--;
                return temporary;
            }

            public void clear(){
                @@ -63,32 +71,39 @@ public void clear(){

                    @Override
                    public Object get(int index) {
                        return null;
                        checkIndex(index);
                        return arr[index];
                    }

                    @Override
                    public int indexOf(Object o) {
                        return 0;
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i].equals((T) o)) {
                                return i;
                            }
                        }
                        return -1;
                    }

                    @Override
                    public int lastIndexOf(Object o) {
                        return 0;
                        int index = -1;
                        for (int i = 0; i < arr.length; i++) if (arr[i].equals((T) o) && i > index) index = i;
                        return index;
                    }

                    @Override
                    public void sort() {

                    }

                    public void delete(int index){
                        checkIndex(index);
                        for(int i= index + 1; i<size; i++){
                            arr[i-1] = arr[i];
                            for(int i = 0; i < size; i++) {
                                for (int j = i; j < size; j++) {
                                    if ((int) arr[j] < (int) arr[i]) {
                                        T temp = arr[i];
                                        arr[i] = arr[j];
                                        arr[j] = temp;
                                    }
                                }
                            }
                            size--;
                        }
                        public void checkIndex(int index){
                            private void checkIndex(int index){
                                if(index < 0 || index>=size){
                                    throw new IndexOutOfBoundsException();
                                }
                            }
                        }