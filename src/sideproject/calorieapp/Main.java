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

            System.out.println("1. Not active");
            System.out.println("2. Light active (1-3 days of exercise)");
            System.out.println("3. Moderately active (moderate exercise 3-5 days)");
            System.out.println("4. Very active (heavy exercise 6-7 days)");
            System.out.println("4. Extremely active (strenuous training 2 times a day)");
            System.out.print("Please enter the number that represents how active are you? ");
            int activity = scanner.nextInt();

            if (activity == 1) {
                maleCalories = (int) (maleCalories * 1.2);
            } else if (activity == 2) {
                maleCalories = (int) (maleCalories * 1.375);
            } else if (activity == 3) {
                maleCalories = (int) (1.55 * maleCalories);
            } else if (activity == 4) {
                maleCalories = (int) (maleCalories * 1.725);
            }else {
                maleCalories = (int) (maleCalories * 1.9);
            }

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

            // initializing female maintenance calories
            int femaleCalories = (int) (655 + (4.3 * userWeight) + (4.7 * userHeight) - (6.8 * userAge));
            System.out.println("1. Not active");
            System.out.println("2. Light activity (1-3 days of exercise)");
            System.out.println("3. Moderately active (moderate exercise 3-5 days)");
            System.out.println("4. Very active (heavy exercise 6-7 days)");
            System.out.println("4. Extremely active (strenuous training 2 times a day)");
            System.out.print("Please enter the number that represents how active are you? ");
            int activity = scanner.nextInt();

            if (activity == 1) {
                femaleCalories = (int) (femaleCalories * 1.2);
            } else if (activity == 2) {
                femaleCalories = (int) (femaleCalories * 1.375);
            } else if (activity == 3) {
                femaleCalories = (int) (femaleCalories * 1.55);
            } else if (activity == 4) {
                femaleCalories = (int) (femaleCalories * 1.725);
            }else {
                femaleCalories = (int) (femaleCalories * 1.9);
            }


            // printing out maintenance calories
            System.out.printf("Your maintenance calories is with: %d %n", femaleCalories);
        }


        System.out.println("Thank you for using Unlimited maintenance calorie calculator!");
        scanner.close();
    }
}