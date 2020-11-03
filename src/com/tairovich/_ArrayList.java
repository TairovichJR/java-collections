package com.tairovich;

import java.util.ArrayList;
import java.util.List;

public class _ArrayList {
    public static void main(String[] args) {

        //The default capacity of an arraylist is 10
        //That means if you add 10 elements and if you add the 11th element
        //Since there is no space for the 11th element, the capacity will increase by 50%
        //ArrayList does not have a method called capacity()
        List<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);

        List<Integer> arrayList2 = new ArrayList<>(5);
        arrayList2.add(1);
        arrayList2.add(2);
        arrayList2.add(3);
        arrayList2.add(4);

        List<Integer> arrayList3 = new ArrayList<>(arrayList2);
        arrayList3.add(5);
        arrayList3.add(6);


    }
}
