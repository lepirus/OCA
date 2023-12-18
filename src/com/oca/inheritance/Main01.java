package com.oca.inheritance;

interface House {
    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Bungalow extends House {
    public default String getAddress() {
        return "101 Smart Str";
    }
}

class MyHouse implements Bungalow, House {

}

public class Main01 {

    public static void main(String[] args) {
        exercise01();
    }

    private static void exercise01() {
        House ci = new MyHouse();  //1
        System.out.println(ci.getAddress()); //2
    }
}
