package com.chadwyck242;

import com.sun.jdi.FloatType;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value: " + myMinFloatValue);
        System.out.println("Float maximum value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value: " + myMinDoubleValue);
        System.out.println("Double maximum value: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue is: " + myIntValue);
        System.out.println("myFloatValue is: " + myFloatValue);
        System.out.println("myDoubleValue is: " + myDoubleValue);

        double myPounds = 124.6d;

        double myKilos = (myPounds / 2.205d);
        System.out.println("myPounds converted to myKilos = " + myKilos);
    }
}
