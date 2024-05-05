package Week3;

import java.util.Scanner;

public class Task3 {
    // Task To Do

    // 1. Write a JAVA program to find the maximum between three numbers.

    public static void main(String[] args){

    int num1 = 10;
    int num2 = 20;
    int num3 = 15;

    int max = num1; 

    if (num2 > max) {
        max = num2;
    }

    if (num3 > max) {
        max = num3;
    }

    System.out.println("Maximum number is: " + max);
    
    // 2. Write a JAVA program to check whether a number is negative, positive, or zero.
    int number=10;
    if (number > 0) {
        System.out.println(number + " is positive.");
    } else if (number < 0) {
        System.out.println(number + " is negative.");
    } else {
        System.out.println("The number is zero.");
    }
    // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.

    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int numb = scanner.nextInt();

        if (numb % 5 == 0 && numb % 11 == 0) {
            System.out.println(numb + " is divisible by both 5 and 11.");
        } else {
            System.out.println(numb + " is not divisible by both 5 and 11.");
        }
    
    // 4. Write a JAVA program to check whether a number is even or odd.

    System.out.print("Enter a number: ");
    int num = scanner.nextInt();

    if (number % 2 == 0) {
        System.out.println(num + " is even.");
    } else {
        System.out.println(num + " is odd.");
    }

    
    
    // 5. Write a JAVA program to check whether a year is a leap year or not. 

    
    System.out.print("Enter a year: ");
    int year = scanner.nextInt();

    boolean isLeapYear = false;

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        isLeapYear = true;
    }

    if (isLeapYear) {
        System.out.println(year + " is a leap year.");
    } else {
        System.out.println(year + " is not a leap year.");
    }
    
    // Hint: if year%4==0; if year%100!==0 ; year%400==0; 
    
    // 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.

    
    System.out.print("Enter an alphabet: ");
    char alphabet = scanner.next().charAt(0);

    alphabet = Character.toLowerCase(alphabet);

    if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
        System.out.println("The entered alphabet '" + alphabet + "' is a vowel.");
    } else {
        System.out.println("The entered alphabet '" + alphabet + "' is a consonant.");
    }

    
    
    
    // Some Switch case Statements Questions:
    
    // 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades.
    
    // 2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement.
    
    // 3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case.
    
    // 4. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case.
    
    }

    
}
