package com.company;


public class IntArrayList implements IntList {

    private static int size;
    private static int[] arr = new int[10];

    public IntArrayList() {
    }

    @Override
    public void add(int element) {
        if (size >= arr.length) {
            resize();
        }
        arr[size] = element;
        size++;

    }


    @Override
    public void add(int index, int element) {
        if (size >= arr.length) {
            resize();
        }

        if (index < 0 || index > arr.length - 1) {
            throw new IndexOutOfBoundsException();
        } else {
            int[] tmp = arr;
            arr = new int[tmp.length + 1];
            System.arraycopy(tmp, 0, arr, 0, index);
            arr[index] = element;
            System.arraycopy(tmp, index, arr, index + 1, tmp.length - index);
        }
        size++;

    }

    private void resize() {
        int newSize = arr.length * 3 / 2 + 1;
        System.out.println("newSize: " + newSize);
        int[] newArr = new int[newSize];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                return true;
            }
        }

        return false;
    }


    @Override
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();
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
    public boolean remove(int index) {
        if (index < 0 || index > arr.length - 1) {
            throw new IndexOutOfBoundsException();
        }
        int[] tmp = arr;
        arr = new int[tmp.length - 1];
        System.arraycopy(tmp, 0, arr, 0, index);
        System.arraycopy(tmp, index + 1, arr, index, tmp.length - index - 1);
        size--;
        return true;
    }

    @Override
    public boolean removeElement(int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                remove(i);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void set(int index, int element) {

            arr[index] = element;

    }

    @Override
    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
