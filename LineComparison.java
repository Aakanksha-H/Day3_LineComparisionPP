package com.bridgelabz.day3;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINE COMPARISON SOLUTION");
        double x1 = Math.floor(Math.random() * 10) % 2;
        double x2 = Math.floor(Math.random() * 10) % 3;
        double y1 = Math.floor(Math.random() * 10) % 4;
        double y2 = Math.floor(Math.random() * 10) % 5;
        double lengthOfLine = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("Length of The Line = " + lengthOfLine);
    }
}
