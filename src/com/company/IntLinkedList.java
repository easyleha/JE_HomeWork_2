package com.company;

public class IntLinkedList implements IntList {

    private int size = 0;
    private Entry first;
    private Entry last;

    private static class Entry {
        int value;
        Entry next;
        Entry previous;

        public Entry(int value) {
            this.value = value;
        }
    }

    @Override
    public void add(int element) {

        Entry newEntry = new Entry(element);
        if (first == null) {
            first = newEntry;
            last = newEntry;
        } else {
            last.next = newEntry;
            newEntry.previous = last;
            last = newEntry;
        }
        size++;

    }

    @Override
    public void add(int index, int element) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }

        Entry newEntry = new Entry(element);

        if(index == 0) {
            // TODO implement
        }

        if (index == size - 1) {
            // TODO implement
        }

        Entry oldEntry = first;
        for (int i = 0; i < index; i++) {
            oldEntry = oldEntry.next;
        }

        Entry oldPrevious = oldEntry.previous;
        oldPrevious.next = newEntry;
        oldEntry.previous = newEntry;

        newEntry.previous = oldPrevious;
        newEntry.next = oldEntry;

        size++;
    }

    @Override
    public void clear() {
        size = 0;

    }

    @Override
    public boolean contains(int value) {
        return false;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
        }

        Entry result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        return result.value;

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean removeElement(int element) {
        return false;
    }

    @Override
    public void set(int index, int element) {

    }

    @Override
    public int size() {
        return size;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(get(i)).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
