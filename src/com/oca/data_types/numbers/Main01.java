package com.oca.data_types.numbers;

public class Main01 {

    public static void main(String[] args) {
        definingFloats();
    }

    private static void definingFloats() {
//        float value = 102.0;  // ERROR: Incompatible types. Found: 'double', required: 'float'
        float value1 = 102;
        float value2 = (int) 102.0;
//        float value3 = 1f * 0.0;  // ERROR: Incompatible types. Found: 'double', required: 'float'
        float value4 = 1f * (short)0.0;
//        float value5 = 1f * (boolean)0;   // ERROR: Inconvertible types; cannot cast 'int' to 'boolean'
        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value4: " + value4);
    }
}
