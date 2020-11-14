package com.tairovich;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {
    public static void main(String[] args) {

        //to compare to arraylist
        //1. sort and then equals
        ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));

        ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A","B","C","D","E"));

        ArrayList<String> l3 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));

        Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);

        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));


        //2. Compare 2 lists and find out additional elements

        ArrayList<String> l4 = new ArrayList<>(Arrays.asList("A","B","C","D","F"));

        ArrayList<String> l5 = new ArrayList<>(Arrays.asList("A","B","C","D","E"));

     //   l4.removeAll(l5);
      //  System.out.println(l4);

        //3. Find out the missing element
        l5.removeAll(l4);
        System.out.println(l5);

        //4. Find out common elements
        ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("Java","Python","Ruby","C#","Js"));

        ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("Java","Python","Ruby","C#","PHP"));

        lang1.retainAll(lang2);

        System.out.println(lang1);
    }
}
