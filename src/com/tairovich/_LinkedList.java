package com.tairovich;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class _LinkedList {
    public static void main(String[] args) {
        /*
        LinkedList class implement List and Deque interfaces
        LinkedLists are slower than arrays


         */

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //insert the specified element at the beginning of this list
        list.addFirst(100);

        //insert the specified element to the end of this list
        list.addLast(500);

        //insert the specified element at the specified position in this list
        list.add(1,200);

        System.out.println(list);

        list.removeFirst();

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
