package com.oca.loops;

public class Main01 {

    public static void main(String[] args) throws Exception {
        exercise01();
    }

    private static void exercise01() {
        int i = 1, j = 10;
        int k = 1;
        do {
            System.out.println("Iteration " + k + ": i=" + i + " j=" + j);
            k++;
            if (i++ > --j) continue;
        } while (i < 5);
        System.out.println("i=" + i + " j=" + j);
    }
}
