package com.company;

public class Main {
    public static void main(String[] args) {

        Class clas = new Class(180104, "Lollipop", new int[]{1, 22, 333, 4444});
        
        System.out.println(clas.getNumber());
        System.out.println(clas.getWord());
        System.out.println(clas.getArray());

    }
}