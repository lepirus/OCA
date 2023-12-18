package com.oca.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main01 {

    public static boolean checkList(List list, Predicate<List> p) {
        return p.test(list);
    }

    public static void main(String[] args) {
        boolean b = checkList(new ArrayList(), al -> al.isEmpty());
        System.out.println(b);
//        b = checkList(new ArrayList(), ArrayList al -> al.isEmpty());     // Error - put the parameter list of the lambda expression in brackets (ArrayList al)
//        b = checkList(new ArrayList(), al -> return al.size() == 0);    // Error - put the body withing curly braces if you want to use the return -> checkList(new ArrayList(), al -> { return al.size() == 0; });
        b = checkList(new ArrayList(), al -> al.add("hello"));
        System.out.println(b);
    }

}
