package com.oca.overloading;

public class Main01 {

    public static void main(String[] args) {
        exercise01();
    }

    private static void exercise01() {
        double a = 10;
        new Main01().probe(a);
    }

    void probe(Object x) {
        System.out.println("In Object");
    } //3

    void probe(Number x) {
        System.out.println("In Number");
    } //2

    void probe(Integer x) {
        System.out.println("In Integer");
    } //2

    void probe(Long x) {
        System.out.println("In Long");
    } //4
}
