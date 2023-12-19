package com.oca.java_api;

public class Main01 {

    public static void main(String[] args) {
        createLocalDateTime();
    }

    private static void createLocalDateTime() {
//        System.out.println(LocalDate.parse("2015-01-02"));    // ERROR - Needed LocalDateTime class
//        System.out.println(java.time.LocalDateTime.parse("2015-01-02"));      // ERROR - LocalDateTime requires date as well as time
        System.out.println(java.time.LocalDateTime.of(2015, 10, 1, 10, 10));
//        System.out.println(java.time.LocalDateTime.of(2015, "January", 1, 10, 10));   // ERROR - All parameters should be ints - Works with Month.JANUARY
    }
}
