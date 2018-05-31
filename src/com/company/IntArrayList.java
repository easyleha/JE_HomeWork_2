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
    public void contains(int value) {

    }

    @Override
    public int get(int index) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void removeElement(int element) {

    }

    @Override
    public void set(int index, int element) {

    }

    @Override
    public int size() {
        return 0;
    }
}
