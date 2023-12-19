package com.oca.array;

import java.util.ArrayList;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        exercise01();
        exercise02();
    }

    /*
    There is a subtle difference between: int[] i; and int i[]; although in both the cases, i is an array of integers.
    The difference is if you declare multiple variables in the same statement such as: int[] i, j; and int i[], j;, j is not of the same type in the two cases.
    In the first case, j is an array of integers while in the second case, j is just an integer.
    Therefore, in this question:
    array1 is an array of int
    array2, array3, array4, and array5  are arrays of int arrays
     */
    private static void exercise01() {
        int[] array1, array2[];
        int[][] array3;
        int[] array4[], array5[];

//        array2 = array3;  // WORKS
//        array2 = array4;  // WORKS
//        array1 = array2;  // ERROR
//        array4 = array1;  // ERROR
//        array5 = array3;  // WORKS
    }

    private static void exercise02() {
        List s1 = new ArrayList();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("a");
        System.out.println(s1.remove("a") + " " + s1.remove("x"));
    }
}
