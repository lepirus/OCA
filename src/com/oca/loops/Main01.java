package com.oca.loops;

public class Main01 {

    public static void main(String[] args) throws Exception {
//        exercise01();
//        crazyLoop();
        crazyLoop2();
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

    private static void crazyLoop() {
        int c = 0;
        JACK: while (c < 8) {
            JILL: System.out.println(c);
            if (c > 3) break JACK;
            else c++;
        }
    }

    private static void crazyLoop2(){
        int c = 0;
        JACK: while (c < 8){
            JILL: System.out.println("c = "+c);
            for(int k = 0; k<c; k++){
                System.out.println(" k = "+k+" c = "+c);
                if (c > 3) break JACK;
            }
            c++;
        }
    }
}
