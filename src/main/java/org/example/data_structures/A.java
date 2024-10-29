package org.example.data_structures;

public interface A<T> {
    void add(T Object);

    void remove(int index);

    void set(int index, T Object);

    int size();

    boolean isEmpty();

    String toString();
}

