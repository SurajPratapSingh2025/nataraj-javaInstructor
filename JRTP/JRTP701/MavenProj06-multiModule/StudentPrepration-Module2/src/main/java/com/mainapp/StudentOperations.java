package com.mainapp;


public class StudentOperations {
    public static void main(String[] args) {
        System.out.println("********* From Module2 ********");
        ArithmeticOperations ao = new ArithmeticOperations();
        System.out.println("Sum = "+ao.sum(100,200));
    }
}
