package com.tairovich;

import java.util.Vector;

public class _Vector {
    public static void main(String[] args) {

        //Vector is very similar to ArrayList.
        //Vector is there from jdk 1.0 where List is from 1.2
        //Differences between Vector and Arraylist since both are implementations of List
        // Vector methods are synchronized, meaning thread-safe making it slow
        // Arraylist methods are not, not thread-safe making it fast
        //Vector capacity increases by 100%, takes up more memory
        //Arraylist capacity increases by 50% takes up less memory
        //Finaally Vectors are outdated and not a good approach to used in projects, instead use ArrayList

        //Default capacity of Vector is 10
        //THat means if you add 10 elements and add the 11th element, the capacity will increase
        //by 100%, making it 20 while arraylist capacity increases by 50%
        //ArrayList does not have a method called capacity()
        //3 constructors in Vector:
        //1. default empty constructor
        //2. int arg constructor
        //3. 2 arg constructor that takes int capacity, int capacityIncrement
        //  that means if you create a vector(15,10) and add the first 15 elements, and add
        // 16th element, the capacity will increase by 10 that is due to the second arg

        Vector<Integer> intVector = new Vector<>();
        intVector.add(1);
        intVector.add(2);
        intVector.add(3);
        intVector.add(4);
        intVector.add(5);
        intVector.add(6);
        intVector.add(7);
        intVector.add(8);
        intVector.add(9);
        intVector.add(10);

        System.out.println(intVector);
        System.out.println(intVector.capacity());

        intVector.add(11);
        System.out.println(intVector.capacity());
        System.out.println();


    }
}
