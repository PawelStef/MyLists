package com.j25.collections;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(10);
        // 10/10
        myArrayList.add(0, 200);
        System.out.println(myArrayList);

        myArrayList.add(5, 300);
        System.out.println(myArrayList);

        myArrayList.add(11);
        System.out.println(myArrayList);
        // 20
        myArrayList.add(1, 100);
        System.out.println(myArrayList);


        // usun ostatni
        myArrayList.remove(myArrayList.size() - 1);
        System.out.println(myArrayList);
        myArrayList.remove(3);
        System.out.println(myArrayList);
        myArrayList.remove(0);
        System.out.println(myArrayList);
    }
}
