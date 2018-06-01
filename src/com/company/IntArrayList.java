package com.company;

public class IntArrayList implements IntList {

    private static int size = 0;
    private static int[] arr = new int[10];

    public static void main(String[] args) {

    }

    @Override
    public void add(int element) {
        add(element);
        size++;

    }

    @Override
    public void add(int index, int element) {
        for (int i = index; i < arr.length; i++) {
            arr[index] = arr[index + 1];
        }
        add(arr[index] = element);

    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            } else {

            }
        }
        return false;
    }


    @Override
    public int get(int index) {
        int element;
        for (int i = 0; i < arr.length; i++) {
            element = arr[index];
        }
        return arr[index];
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void remove(int index) {
        for (int i = 0; i <= arr.length; i++) {
            arr[index] = 0;
        }
        arr[index] = arr[arr.length];
        size--;
    }

    @Override
    public void removeElement(int element) {
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == element) {
                arr[i] = 0;
            }
            arr[i] = arr[arr.length];
        }
        size--;
    }

    @Override
    public void set(int index, int element) {
        for (int i = 0; i <= arr.length; i++) {
            arr[index] = element;
        }

    }

    @Override
    public int size() {
        return size;
    }
}
