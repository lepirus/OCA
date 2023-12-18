package com.oca.data_types;

public class Main01 {

    static boolean b;
    static int[] ia = new int[1];
    static char ch;
    static boolean[] ba = new boolean[1];

    public static void main(String[] args) {
        System.out.println("Hello OCA tests!");

        exercise01();
        exercise02();

        System.out.println("End OCA tests!");
    }

    private static void exercise01() {
        System.out.println(Boolean.parseBoolean("true"));
//        System.out.println(new Boolean(null)));   // Error
//        System.out.println(new Boolean()));   // Error
        System.out.println(new Boolean("true"));
        System.out.println(new Boolean("trUE"));
    }

    private static void exercise02() {
        boolean x = false;
        if (b) {
            x = (ch == ia[ch]);
        } else x = (ba[ch] = b);
        System.out.println(x + " " + ba[ch]);

    }

}