/*
Justin Lazarski
Jonathan La Rosa
Team Project 1: Question 2 Palidrome Tester
CIS 3090.04
4/5/19
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create the scanner
        Scanner input = new Scanner(System.in);
        // Create the variables
        String userInput;
        String reverseInput;
        // Initialize the variables
        userInput = "";
        reverseInput = "";
        // Prompt user to input a string
        System.out.println("Please input a string");
        // Place user input into the userInput variable
        userInput = input.nextLine();
        System.out.println("Input: " + userInput);

        String strippedInput = userInput;
        // Convert strippedInput to ignore case, spaces, non-words, and digits.
        strippedInput = strippedInput.toLowerCase();
        strippedInput = strippedInput.replaceAll(" ", "");
        strippedInput = strippedInput.replaceAll("\\W", "");
        strippedInput = strippedInput.replaceAll("\\d", "");
        // Print the strippedInput
        System.out.println("Test input: " + strippedInput);

        int length = strippedInput.length();
        // Reverse the strippedInput Variable and store it in the reverseInput variable
        // This for loop starts at index 2 and will iterate through the userInput variable until it reaches 0 while placing them into reverseInput
        for(int i = strippedInput.length() - 1; i >= 0; i--) {
            reverseInput = reverseInput + strippedInput.charAt(i);
        }
        //System.out.println(reverseInput);
        System.out.println("ReverseInput: " + reverseInput);
        // This if else statement checks if userInput is equal to reverseInput
        if (strippedInput.equals(reverseInput)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }
}
