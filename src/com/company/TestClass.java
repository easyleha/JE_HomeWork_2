package com.company;




public class TestClass {
    public static void main(String[] args) {

        IntArrayList list = new IntArrayList();


        for (int i = 0; i <20 ; i++) {
            list.add(i);
        }
        System.out.println(list);
//        boolean  contains(int value);
        list.set(1, 100);
        list.set(0, 100);
        System.out.println(list);
        System.out.println(list.contains(1));
        System.out.println(list.contains(0));
    }
}