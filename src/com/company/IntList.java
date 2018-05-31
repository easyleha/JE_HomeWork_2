package com.company;

public interface IntList {
    void add(int element);

    void add(int index, int element);

    void clear();

    void  contains(int value);

    int get(int index);

    boolean isEmpty();

    void remove(int index);

    void removeElement(int element);

    void set(int index, int element);

    int size();
}
