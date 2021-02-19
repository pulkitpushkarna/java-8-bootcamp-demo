package com.java.bootcamp;

@FunctionalInterface
interface Operation{
    void perform(int a,int b);
}

class ArithmeticOperation{

    void performArithemeticOperation(int a, int b, Operation operation){
            operation.perform(a,b);
    }
}

public class Main {

    public static void main(String[] args) {
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        int a = 1;
        int b = 2;
        arithmeticOperation.performArithemeticOperation(a, b, (c, d)-> System.out.println(c+d));
        arithmeticOperation.performArithemeticOperation(a, b, (c, d)-> System.out.println(c-d));
        arithmeticOperation.performArithemeticOperation(a, b, (c, d)-> System.out.println(c*d));
        arithmeticOperation.performArithemeticOperation(a, b, (c, d)-> System.out.println(c*d+5));

    }
}
