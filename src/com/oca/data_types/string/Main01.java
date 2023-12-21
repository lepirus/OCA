package com.oca.data_types.string;

import java.util.Locale;

public class Main01 {

    public static void main(String[] args) {
        indexOf();
    }

    /* Chapter 3, Page 107 */
    private static void indexOf() {
        String s = "animals";

        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf("al"));
        System.out.println(s.indexOf('a', 4));
        System.out.println(s.indexOf("al", 5));

        s.toUpperCase(Locale.ROOT);
    }
}
