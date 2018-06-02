package com.company;


public class IntArrayList implements IntList {

    private static int size = 0;
    private static int sizeArr = 10;
    private static int[] arr = new int[sizeArr];

    public IntArrayList() {
    }

    @Override
    public void add(int element) {
        if (size > arr.length) {
            sizeArr = sizeArr * 3 / 2 + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = element;
        }
        size++;

    }

    @Override
    public void add(int index, int element) {
        if (size > arr.length) {
            sizeArr = sizeArr * 3 / 2 + 1;
        }
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
        for (int i = 0; i < arr.length; i++) {
            if(i == index){
                arr[i] = arr[index];
            }
            if (index > size) {
                break;
            }
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

        arr[index] = 0;
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
        if (index > size) {
            return;
        }
        for (int i = 0; i <= arr.length; i++) {
            arr[index] = element;
        }

    }

    @Override
    public int size() {
        return size;
    }
}
