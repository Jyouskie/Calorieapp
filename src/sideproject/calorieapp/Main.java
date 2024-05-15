package sideproject.calorieapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // initializing the scanner.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, Welcome to Unlimited.");

        System.out.print("Please enter male or female: ");
        String userChoice = scanner.nextLine().toLowerCase();

        if (userChoice.equals("male")) {

            // asking user to enter their weight, height, and age.
            System.out.print("PLease enter your weight: ");

            int userWeight = scanner.nextInt();

            System.out.print("Please enter your height in inches: ");
            int userHeight = scanner.nextInt();

            System.out.print("Please enter your age: ");
            int userAge = scanner.nextInt();

            // initializing male maintenance calories
            int maleCalories = (int) (655 + (6.23 * userWeight) + (12.7 * userHeight) - (6.8 * userAge));

            // printing out maintenance calories
            System.out.printf("Your maintenance calories is: %d %n", maleCalories);
        }
        else {
            // asking user to enter their weight, height, and age.
            System.out.print("PLease enter your weight: ");

            int userWeight = scanner.nextInt();

            System.out.print("Please enter your height in inches: ");
            int userHeight = scanner.nextInt();

            System.out.print("Please enter your age: ");
            int userAge = scanner.nextInt();

            // initializing male maintenance calories
            int femaleCalories = (int) (655 + (4.3 * userWeight) + (4.7 * userHeight) - (6.8 * userAge));

            // printing out maintenance calories
            System.out.printf("Your maintenance calories is: %d %n", femaleCalories);
        }


        System.out.println("Thank you for using Unlimited maintenance calorie calculator!");
        scanner.close();
    }
}