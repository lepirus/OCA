package com.oca.data_types;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("Hello OCA tests!");

        exercise01();

        System.out.println("End OCA tests!");
    }

    private static void exercise01() {
        System.out.println(Boolean.parseBoolean("true"));
//        System.out.println(new Boolean(null)));   // Error
//        System.out.println(new Boolean()));   // Error
        System.out.println(new Boolean("true"));
        System.out.println(new Boolean("trUE"));
    }

}