package com.company;


public class TestClass {
    public static void main(String[] args) {

        IntArrayList list = new IntArrayList();
        list.add(5);
        list.add(3);



        System.out.println("size: " + list.size());

        System.out.println("isEmpty: " + list.isEmpty());

        System.out.println("contains: " + list.contains(4));

        System.out.println("get: " + list.get(0));

        list.remove(0);

        list.removeElement(4);

        System.out.println("size: " + list.size());

        list.set(5, 10);
        list.clear();
        System.out.println("size: " + list.size());



    }
}