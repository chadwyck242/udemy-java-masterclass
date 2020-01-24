package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(myMinIntValue);
        System.out.println(myMaxIntValue);

        byte myByte = 109;
        short myShort = 30100;

        int myInt = 1245843;
        long myLong = (long) (50000 + (10 * (myByte + myShort + myInt)));
        System.out.println(myLong);
    }
}
