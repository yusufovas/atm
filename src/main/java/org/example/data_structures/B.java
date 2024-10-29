package org.example.data_structures;

class B<T> implements A<T> {
    private T[] array;
    int count;

    public B() {
        this(10);
    }

    public B(int initialSize) {
        array = (T[]) new Object[initialSize];
        count = 0;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

}