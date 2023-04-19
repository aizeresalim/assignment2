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
     * @function increaseBufferIfNeeded increase array buffer
     * @noparams
     * @return void
     * **/
    public void increaseBufferIfNeeded(){
        if(size == arr.length){
            T[] newArr = (T[]) new Object[arr.length*2];
            @@ -16,22 +24,43 @@ public void increaseBufferIfNeeded(){
                arr = newArr;
            }
        }
        /**
         * @function size returns the length of the array
         * @noparams
         * @return int
         * **/
        @Override
        public int size() {
            return this.size;
        }
        /**
         * @function contains true if Object o is in array
         * @param o
         * @return int
         * **/
        @Override
        public boolean contains(Object o) {
            for(T element : arr) {
                if (o.equals(element)) return true;
            }
            return false;
        }
        /**
         * @function add - adds an object to an array
         * @param item object to add
         * @return void
         * **/
        @Override
        public void add(Object item) {
            increaseBufferIfNeeded();
            arr[size++] = (T) item;
        }
        /**
         * @function add true if Object o in array
         * @param item object to add
         * @param index index where to add item
         * @return void
         * **/
        @Override
        public void add(Object item, int index) {
            checkIndex(index);
            @@ -42,7 +71,12 @@ public void add(Object item, int index) {
                arr[index] = (T) item;
                size++;
            }
            // 0(n^2)
            /**
             * @function remove - removes an object from an array
             * @param item delete object
             * @return boolean
             * **/
            // Complexity: 0(n^2)
            @Override
            public boolean remove(Object item) {
                int index = indexOf(item);
                @@ -52,7 +86,11 @@ public boolean remove(Object item) {
                }
                return false;
            }

            /**
             * @function remove - removes an object from an array
             * @param index The index of the element to remove
             * @return boolean
             * **/
            @Override
            public Object remove(int index) {
                checkIndex(index);
                @@ -63,18 +101,30 @@ public Object remove(int index) {
                    this.size--;
                    return temporary;
                }

                /**
                 * @function clear - clears the array
                 * @noparam
                 * @return void
                 * **/
                public void clear(){
                    this.arr = (T[]) new Object[5];
                    this.size = 0;
                }

                /**
                 * @function get - returns an object from the array at its index
                 * @param index
                 * @return Object
                 * **/
                @Override
                public Object get(int index) {
                    checkIndex(index);
                    return arr[index];
                }

                /**
                 * @function indexOf - returns the index of the first occurrence of an object
                 * @param o object to search
                 * @return int
                 * **/
                @Override
                public int indexOf(Object o) {
                    for (int i = 0; i < arr.length; i++) {
                        @@ -84,13 +134,22 @@ public int indexOf(Object o) {
                        }
                        return -1;
                    }

                    /**
                     * @function lastIndexOf returns the index of the last occurrence of an object in an array
                     * @param o object to search
                     * @return int
                     * **/
                    @Override
                    public int lastIndexOf(Object o) {
                        int index = -1;
                        for (int i = 0; i < arr.length; i++) if (arr[i].equals((T) o) && i > index) index = i;
                        return index;
                    }
                    /**
                     * @function sort- sorts the array (bubble sort, O(n^2))
                     * @noparam
                     * @return void
                     * **/
                    @Override
                    public void sort() {
                        for(int i = 0; i < size; i++) {
                            @@ -103,6 +162,11 @@ public void sort() {
                            }
                        }
                    }
                    /**
                     * @function checkIndex - checks the index for its validity within the data structure
                     * @param index
                     * @return void
                     * **/
                    private void checkIndex(int index){
                        if(index < 0 || index>=size){
                            throw new IndexOutOfBoundsException();
                        }
                    }
                }