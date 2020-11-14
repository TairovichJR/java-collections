package com.tairovich;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
    public static void main(String[] args) {

        //From duplicate elements from this arraylist
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,2,2,2,1,2,3,5,6,7,8,6,5));
        System.out.println(numbers);
        //1. LinkedHashSet
        LinkedHashSet<Integer> unique = new LinkedHashSet<>(numbers);
        ArrayList<Integer> uniqueNums = new ArrayList<>(unique);
        System.out.println(uniqueNums);

        //2. jdk streams
        List<Integer> uniqueNumes2 = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueNumes2);


    }
}
