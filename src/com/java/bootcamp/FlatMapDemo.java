package com.java.bootcamp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo {

    public static void main(String[] args) {
       List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8),
                Arrays.asList(9,10,11,12)
        );
        System.out.println("Before flatMap::"+lists);
              List<Integer> integerList =  lists.stream().flatMap(e-> e.stream())
                .collect(Collectors.toList());
        System.out.println("After flatMap::"+integerList);

    }
}
