package com.oca.inheritance;

interface Flyer {
    String getName();
}

class Bird implements Flyer {
    public String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }
}

public class Main02 {

    public static void main(String[] args) throws Exception {
        Flyer f = new Eagle("American Bald Eagle");

        //PRINT NAME HERE
//        System.out.println(f.name);   // Error
        System.out.println(f.getName());
        System.out.println(((Eagle) f).name);
        System.out.println(((Bird) f).getName());
//        System.out.println(Eagle.name);     // Error - name is not a static field
//        System.out.println(Eagle.getName(f));   // Error - doesn't make any sense
    }
}
