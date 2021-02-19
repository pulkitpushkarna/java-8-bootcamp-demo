package com.java.bootcamp;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Doubt {

    public static void main(String[] args) {
//        Supplier<String> supplier = ()->"Hello";
//        System.out.println(supplier.get());
//        System.out.println(Arrays.asList().stream().findFirst().orElseGet(()->0 ));
//
//        Predicate<Integer> isEven = n->n%2==0;
//        System.out.println(isEven.test(3));
//        Arrays.asList(1,2,3,4,5).stream().filter(isEven).forEach(System.out::println);
//
//        Function<Integer,Integer> multiplyByTwo = n->n*2;
//        multiplyByTwo.andThen(n->n+4);
//        Arrays.asList(1,2,3,4).stream().map(multiplyByTwo).forEach(System.out::println);

        Consumer<Integer> consumer = e->System.out.println(String.format("Value : %d",e));
//        consumer.accept(3);
        Arrays.asList(1,2,3,4).forEach(consumer.andThen(e-> System.out.println(e*2))
                .andThen(e-> System.out.println(e*3))
                .andThen(e-> System.out.println(e*4)));
    }
}
