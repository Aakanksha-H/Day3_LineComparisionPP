package com.bridgelabz.day3;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINE COMPARISON SOLUTION");
        String lengthOfLine1;
        String lengthOfLine2;
        double x1 = Math.floor(Math.random() * 10) % 2;
        double x2 = Math.floor(Math.random() * 10) % 3;
        double y1 = Math.floor(Math.random() * 10) % 4;
        double y2 = Math.floor(Math.random() * 10) % 5;

        double x21 = Math.floor(Math.random() * 10) % 2;
        double x22 = Math.floor(Math.random() * 10) % 3;
        double y21 = Math.floor(Math.random() * 10) % 4;
        double y22 = Math.floor(Math.random() * 10) % 5;

        lengthOfLine1 = String.valueOf(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        System.out.println("Length of The Line1 = " + lengthOfLine1);

        lengthOfLine2 = String.valueOf(Math.sqrt((x22 - x21) * (x22 - x21) + (y22 - y21) * (y22 - y21)));
        System.out.println("Length of The Line2 = " + lengthOfLine2);

        if (lengthOfLine1.equals(lengthOfLine2)){
            System.out.println("Lines are equal");
        }
        else {
            System.out.println("Lines are not equal");
        }
    }
}
