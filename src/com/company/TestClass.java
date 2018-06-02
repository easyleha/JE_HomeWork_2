package com.company;


public class TestClass {
    public static void main(String[] args) {

        IntArrayList list = new IntArrayList();
        list.add(5);
        list.add(3);


        //System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(4));

        //list.remove(0);
        //list.removeElement(4);
        System.out.println(list.size());
        list.set(5, 10);

    }
}