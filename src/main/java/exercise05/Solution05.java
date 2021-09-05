/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sue Lin
 */

package exercise05;

import java.util.Scanner;

/*
* pseudo code
* Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:
*   -prompt user for 2 numbers
*   -store the numbers in an int
*   -make the program calculate the sum, store the value and print it
*   -make the program calculate the difference, store the value and print
*   -make the program calculate the product, store the value and print
*   -make the program calculate the quotient, store the value and print
 */

public class Solution05 {
    public static void main (String[] args)
    {
        System.out.print("What is the first number?: ");
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());

        System.out.print("What is the second number?: ");
        int second = Integer.parseInt(scanner.nextLine());

        int sum = first + second;
        int diff = first - second;
        int prod= first * second;
        int quot = first / second;

        System.out.print(first + " + " + second + " = " + sum + "\n");
        System.out.print(first + " - " + second + " = " + diff + "\n");
        System.out.print(first + " * " + second + " = " + prod + "\n");
        System.out.print(first + " / " + second + " = " + quot + "\n");
    }
}
