package com.oca.constructors;

class A {
    int i;

    public A(int x) {
        this.i = x;
    }
}

class B extends A {
    int j;

    //    B( ) { }  // error -> Super class needs to be constructed first
    //    B(int y ) { j = y; }  // error
    //    B(int y ) { i = y; j = y*2; }  // error

    public B(int x, int y) {
        super(x);
        this.j = y;
    }

    //    B(int z ) { this(z, z); }     // Works
}

public class Main01 {
    public static void main(String[] args) {
        exercise01();
    }

    private static void exercise01() {
        B b = new B(1, 2);
        System.out.println(b.i + " " + b.j);
    }

}
