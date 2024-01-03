package com.oca.examples.packageb;

import com.oca.examples.packagea.ClassA;

/**
 * To manually compile and run this file, open cmd, go to src/ folder and run:
 * Compile: javac com/oca/examples/packagea/ClassA.java com/oca/examples/packageb/ClassB.java
 * Run: java com.oca.examples.packageb.ClassB
 */
public class ClassB {
    public static void main(String[] args) {
        ClassA a;
        System.out.println("Got it");
    }
}
