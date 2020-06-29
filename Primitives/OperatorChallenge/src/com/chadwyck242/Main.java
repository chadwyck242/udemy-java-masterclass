package com.chadwyck242;

public class Main {

    public static void main(String[] args) {
	// Code for the Operator and Operator Precedence Challenge
        // Video 39 of Section 3: First Steps

        double firstValue = 20.00;
        double secondValue = 80.00;

        double thirdValue = (firstValue + secondValue) * 100.00;

        double fourthValue = thirdValue % 40.00d;

        boolean fifthValue = (fourthValue == 0) ? true : false;

        System.out.println(fifthValue);

        // This should return nothing, as there is no remainder above!
        if (!fifthValue){
            System.out.println("Got some remainder");
        }

    }
}
