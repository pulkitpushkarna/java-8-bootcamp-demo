package com.java.bootcamp;

import java.util.Arrays;

interface DemoInterface {
    String myMethod(char [] chars);
}

class Employee{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary ) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
@FunctionalInterface
interface EmployeeInterface{
    Employee createEmployee(int id, String name, int salary);
}

public class ConstructorReference {

    public static void main(String[] args) {

        EmployeeInterface employeeInterface = Employee::new;
        EmployeeInterface employeeInterfaceLambda = (id,name,salary)->new Employee(id,name,salary);
        Employee employee = employeeInterface.createEmployee(1,"Sunny",100000);
        System.out.println(employee);

        DemoInterface demoInterface = String::new;
        String str=demoInterface.myMethod(new char[]{'a', 'b', 'c', 'd'});
        System.out.println(str);

    }

}
