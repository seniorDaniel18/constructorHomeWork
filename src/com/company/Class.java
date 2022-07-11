package com.company;

import java.util.Arrays;

public class Class {

    private int number;
    private String word;
    private int[] array;

    public Class (int number, String word, int[] array){

        this.number = number;
        this.word = word;
        this.array = array;
    }

    public int getNumber() {
        return number;
    }


    public String getWord() {
        return word;
    }

    public String getArray(){
        return Arrays.toString(array);
    }
}
