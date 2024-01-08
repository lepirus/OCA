package com.oca._01_building_blocks.initialize;

public class Chick {

    private String name = "Fluffy";

    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor. Name: " + name);
    }

    {
        System.out.println("setting field name: " + name);
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}
