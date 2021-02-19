package com.java.bootcamp;

import java.util.Arrays;

public class MethodAndConstructorRefrence {

    void printWithStyle(Integer e){
        System.out.println(String.format("Value for my object :: %d",e));
    }

    static void printWithStyleStatic(Integer e){
        System.out.println(String.format("Value for my object from static method :: %d",e));
    }

    public static void main(String[] args) {
        MethodAndConstructorRefrence methodAndConstructorRefrence= new MethodAndConstructorRefrence();
        Arrays.asList(1,2,3,4,5).forEach(e-> System.out.println(e));
        Arrays.asList(1,2,3,4,5).forEach(methodAndConstructorRefrence::printWithStyle);
        Arrays.asList(1,2,3,4,5).forEach(MethodAndConstructorRefrence::printWithStyleStatic);
    }
}
