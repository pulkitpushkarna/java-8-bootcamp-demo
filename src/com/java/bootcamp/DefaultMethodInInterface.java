package com.java.bootcamp;

interface Demo{


    default void display(){
        System.out.println("This is demo default method");
    }
    default void display2(){
        System.out.println("This is demo default method 2");
    }
    static void displayStatic(){
        System.out.println("This is demo Static method");
    }
}

class DemoImpl implements Demo{

    @Override
    public void display(){
        System.out.println("This is DemoImpl method");
    }
}

class DemoImpl1 implements Demo{

}

class DemoImpl2 implements Demo{

    @Override
    public void display2(){
        System.out.println("This is DemoImpl method 1");
    }
}

public class DefaultMethodInInterface {

    public static void main(String[] args) {
        Demo.displayStatic();
        DemoImpl demo = new DemoImpl();
        demo.display();
    }



}
