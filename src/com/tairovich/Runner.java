package com.tairovich;

public class Runner {
    public static void main(String[] args) {


        LinkedList list =  new LinkedList();
        list.insert(12);
        list.insert(14);

        list.insertAt(1,13);
        list.deleteAt(1);
        list.show();


    }
}
