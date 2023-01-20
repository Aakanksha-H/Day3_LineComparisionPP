package com.bridgelabz.day3;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("WELCOME TO LINE COMPARISON SOLUTION");

        double line1, line2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter end of fist line = ");
        line1 = sc.nextDouble();

        System.out.print("Enter end of second line = ");
        line2 = sc.nextDouble();

        if (Double.compare(line1,line2) == 0) {
            System.out.println("Lines have same length");
        }
        else if (Double.compare(line1,line2) < 0)
            System.out.println("Line 1 is smaller than Line 2");
        else
            System.out.println("Line 1 is greater than Line 2");
    }
}
