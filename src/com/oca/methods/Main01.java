package com.oca.methods;

public class Main01 {
    private int myValue = 0;

    public static void main(String[] args) {
        exercise01();
    }

    private static void exercise01() {
        Main01 ct = new Main01();
        ct.showTwo(200);
        System.out.println(ct.myValue);
        ct.showOne(100);
        System.out.println(ct.myValue);
    }

    public void showOne(int myValue) {
        myValue = myValue;
    }

    public void showTwo(int myValue) {
        this.myValue = myValue;
    }

}