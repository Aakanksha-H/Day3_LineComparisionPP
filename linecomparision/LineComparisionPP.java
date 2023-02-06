package com.bridgelabz.oops.linecomparision;

public class LineComparisionPP extends LineMeasurements {

    private static String lengthOfLine1 = String.valueOf(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
    private static String lengthOfLine2 = String.valueOf(Math.sqrt((x12 - x11) * (x12 - x11) + (y12 - y11) * (y12 - y11)));

    public static void main(String[] args) {
        LineComparisionPP lineComparisionPP = new LineComparisionPP();
        System.out.println("Length of line 1 is " + lengthOfLine1);
        System.out.println("Length of line 2 is " + lengthOfLine2);
        lineComparisionPP.checkEquality();
        lineComparisionPP.compareLines();
    }

    public void checkEquality() {
        if (lengthOfLine1.equals(lengthOfLine2)) {
            System.out.println("Lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }
    }

    public void compareLines() {
        if (lengthOfLine1.compareTo(lengthOfLine2) == 0) {
            System.out.println("Lines have same length");
        } else if (lengthOfLine1.compareTo(lengthOfLine2) < 0) {
            System.out.println("Line 1 is smaller than Line 2");
        } else {
            System.out.println("Line 1 is greater than Line 2");
        }
    }
}
