package com.oca.operators;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("Hello OCA tests!");

        exercise01();

        System.out.println("End OCA tests!");
    }

    private static void exercise01() {
        int x = 1;
        int y = 2;
        int z = x++;
        int a = --y;
        int b = z--;
        b += ++z;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int answ = x > a ? y > b ? y : b : x > z ? x : z;   // int answ = x > a ? (y > b ? y : b) : (x > z ? x : z);
        System.out.println("answ: " + answ);
    }

}