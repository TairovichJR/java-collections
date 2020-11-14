package com.tairovich;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
    public static void main(String[] args) {

        //list of thread safe synchronization wrappers
        /*
             Collections.synchronizedCollection()
             Collections.synchronizedList()
             Collections.synchronizedMap()
             Collections.synchronizedSortedMap()
             Collections.synchronizedSet()
             Collections.synchronizedSortedSet()
        */
        //1st way synchronizing our arraylist
        List<String> names = Collections.synchronizedList(new ArrayList<String>());
        names.add("Java");
        names.add("Python");
        names.add("Ruby");

        //for add and remove operations, we dont need synchronization

        //but to fetch/traverse the values from this list, we have to use explicit synchronization

        synchronized (names){
            Iterator<String> itr = names.iterator();
            while (itr.hasNext()){
                System.out.println(itr.next());
            }
        }

        //2nd way of synchronizing our arraylist: copyOnWriteArrayList -> thread safe version of arraylist
        //when you create you collection with copyOnWriteArrayList, it is already synchronized

        CopyOnWriteArrayList<String> names2 = new CopyOnWriteArrayList<>();
        names2.add("C#");
        names2.add("Javascript");
        names2.add("Python");

        //no need for an external synchnorization for adding, removing or traversing this collection

        Iterator<String> itr = names2.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
