package com.company;

public class YearRange {

    private int year;
    private int firstDivisor;
    private int secondDivisor;
    private int range;
    private int RangeType;
    private int startYear;
    private int endYear;
    private int x;

    public YearRange() {
    }

    public YearRange(int startYear, int endYear) {
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public void setRange(int startYear, int endYear) {
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public void setRangeType(int RangeType) {
        this.RangeType = RangeType;
    }

    public void setFirstDivisor(int firstDivisor) {
        this.firstDivisor = firstDivisor;
    }

    public void setSecondDivisor(int secondDivisor) {
        this.secondDivisor = secondDivisor;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public int getFirstDivisor() {
        return firstDivisor;
    }

    public int getSecondDivisor() {
        return secondDivisor;
    }

    public int getRangeType() {
        return RangeType;
    }

    public void printYears() {

        if (RangeType == 1) {
            int mod1 = x % 14;
            int mod2 = x % 20;
            for (x = 1314; x <= 2014; x++) {
                if (mod1 == 0 || mod2 == 0) {
                    System.out.println("List of all years divisible by 14 and 20 between 1314 and 2014 is: " + x);
                }
            }
        } else if (RangeType == 2) {
            int mod3 = x % 4;
            for (x = 1100; x <= 3150; x++) {
                if (mod3 == 0) {
                    System.out.println("List of all leap years between 1100 and 3150 is " + x);
                }
            }
        } else {
            int mod4 = x % 3;
            for (int x = 1500; x <= 1890; x++) {
                if (mod4 == 0) {
                    System.out.println("List of Olympic years between 1500 and 1890 is " + x);
                }
            }
        }
    }
}

