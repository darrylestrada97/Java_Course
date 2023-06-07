package dev.lap;

import external.Child;

public class Main {
    public static void main(String[] args) {


        Parent parent = new Parent("Jana Doe","01/01/2020", 4);
        Child child = new Child();
        System.out.println(parent);
        System.out.println(child);
    }
}
