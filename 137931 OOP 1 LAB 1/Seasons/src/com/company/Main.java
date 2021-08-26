package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        YearRange myFirstRange = new YearRange(1314, 2014);
        myFirstRange.setFirstDivisor(14);
        myFirstRange.setSecondDivisor(20);
        myFirstRange.setRangeType(1);


        YearRange mySecondRange = new YearRange(1100, 3150);
        mySecondRange.setFirstDivisor(4);
        mySecondRange.setRangeType(2);


        YearRange myThirdRange = new YearRange(1500, 1890);
        myThirdRange.setFirstDivisor(3);
        myThirdRange.setRangeType(3);

        myFirstRange.printYears();
        mySecondRange.printYears();
        myThirdRange.printYears();

    }
}
