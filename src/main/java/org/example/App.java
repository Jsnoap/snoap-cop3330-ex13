/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    // Function to calculate compound interest
    // Prompts user for starting amount, years, interest rate, num of periods per year to compound
    // Prints out the total amount at the end
    public static void main( String[] args )
    {
        double principal, rate, years, perYear, sum;

        System.out.println("What is the principal amount?");
        Scanner inputPrincipal = new Scanner(System.in);
        principal = inputPrincipal.nextDouble();

        System.out.println("What is the rate?");
        Scanner inputRate = new Scanner(System.in);
        rate = inputRate.nextDouble();

        System.out.println("What is the number of years?");
        Scanner inputYears = new Scanner(System.in);
        years = inputYears.nextDouble();

        System.out.println("What is the number of times the interest is compounded per year?");
        Scanner inputPerYear = new Scanner(System.in);
        perYear = inputPerYear.nextDouble();

        sum = (1 + (rate / 100) / perYear);
        sum = principal * Math.pow(sum, (perYear * years));

        System.out.println("$" + String.format("%.2f", principal) + " invested at " + rate + "% for " + years + " years compounded " + String.format("%.0f", perYear) + " times per year is $" + String.format("%.2f", sum) + ".");
    }
}
