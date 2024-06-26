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
            System.out.println("please round to the nearest whole number.");
            System.out.print("PLease enter your weight in kg: ");

            double userWeight = scanner.nextInt();

            System.out.print("Please enter your height in cm: ");
            double userHeight = scanner.nextInt();

            System.out.print("Please enter your age: ");
            int userAge = scanner.nextInt();

            // initializing male maintenance calories
            int maleCalories = (int) ((10 * userWeight) + (6.25 * userHeight) - (5 * userAge) + 5);

            // Asking the user about how active they are.
            System.out.println("1. Not active (very little exercise, works a desk job)");
            System.out.println("2. Light active (1-3 days of exercise)");
            System.out.println("3. Moderately active (moderate exercise 3-5 days)");
            System.out.println("4. Very active (heavy exercise 6-7 days)");
            System.out.println("4. Extremely active (strenuous training 2 times a day)");
            System.out.print("Please enter the number that represents how active are you? ");
            int activity = scanner.nextInt();

            // calculating user maintenance calories
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
            System.out.println("Please select one of the following numbers.");
            System.out.println("1. Cut");
            System.out.println("2. Bulk");
            int userPlan = scanner.nextInt();

            if (userPlan == 1) {
                System.out.println("How aggressive do you want the cut to be?");
                System.out.println("1. -.5 pound a week");
                System.out.println("2. -1 pound a week");
                System.out.println("3. -2 pounds a week");
                int userSelection = scanner.nextInt();

                if (userSelection == 1){
                    maleCalories = maleCalories - 250;
                    System.out.printf("The recommend calories for losing .5 pounds a week is %d. %n", maleCalories);
                } else if (userSelection == 2) {
                    maleCalories = maleCalories - 500;
                    System.out.printf("The recommend calories for losing 1 pounds a week is %d. %n", maleCalories);
                } else {
                    maleCalories = maleCalories - 1000;
                    System.out.printf("The recommend calories for losing 2 pounds a week is %d. %n", maleCalories);
                }
            } else {
                System.out.println("How aggressive do you want the bulk to be?");
                System.out.println("1. .5 pound a week");
                System.out.println("2. 1 pound a week");
                System.out.println("3. 2 pounds a week");
                int userSelection = scanner.nextInt();

                if (userSelection == 1) {
                    maleCalories = maleCalories + 250;
                    System.out.printf("The recommend calories for gaining .5 pounds a week is %d. %n", maleCalories);
                } else if (userSelection == 2) {
                    maleCalories = maleCalories + 500;
                    System.out.printf("The recommend calories for gaining 1 pounds a week is %d. %n", maleCalories);
                } else {
                    maleCalories = maleCalories + 1000;
                    System.out.printf("The recommend calories for gaining 2 pounds a week is %d. %n", maleCalories);
                }

            }
        }
        else {
            // asking user to enter their weight, height, and age.
            System.out.println("please round to the nearest whole number.");
            System.out.print("PLease enter your weight in kg: ");

            double userWeight = scanner.nextInt();

            System.out.print("Please enter your height in cm: ");
            double userHeight = scanner.nextInt();

            System.out.print("Please enter your age: ");
            int userAge = scanner.nextInt();

            // initializing female maintenance calories
            int femaleCalories = (int) ((10 * userWeight) + (6.25 * userHeight) - (5 * userAge) - 161);

            // Asking the user about how active they are.
            System.out.println("1. Not active (very little exercise, works a desk job)");
            System.out.println("2. Light activity (1-3 days of exercise)");
            System.out.println("3. Moderately active (moderate exercise 3-5 days)");
            System.out.println("4. Very active (heavy exercise 6-7 days)");
            System.out.println("4. Extremely active (strenuous training 2 times a day)");
            System.out.print("Please enter the number that represents how active are you? ");
            int activity = scanner.nextInt();

            // calculating user maintenance calories
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

            // asking user how intense the cut or bulk will be
            System.out.println("Please select one of the following numbers.");
            System.out.println("1. Cut");
            System.out.println("2. Bulk");
            int userPlan = scanner.nextInt();

            if (userPlan == 1) {
                System.out.println("How aggressive do you want the cut to be?");
                System.out.println("1. -.5 pound a week");
                System.out.println("2. -1 pound a week");
                System.out.println("3. -2 pounds a week");
                int userSelection = scanner.nextInt();

                if (userSelection == 1){
                    femaleCalories = femaleCalories - 250;
                    System.out.printf("The recommend calories for losing .5 pounds a week is %d. %n", femaleCalories);
                } else if (userSelection == 2) {
                    femaleCalories = femaleCalories - 500;
                    System.out.printf("The recommend calories for losing 1 pounds a week is %d. %n", femaleCalories);
                } else {
                    femaleCalories = femaleCalories - 1000;
                    System.out.printf("The recommend calories for losing 2 pounds a week is %d. %n", femaleCalories);
                }
            } else {
                System.out.println("How aggressive do you want the bulk to be?");
                System.out.println("1. .5 pound a week");
                System.out.println("2. 1 pound a week");
                System.out.println("3. 2 pounds a week");
                int userSelection = scanner.nextInt();

                if (userSelection == 1){
                    femaleCalories = femaleCalories + 250;
                    System.out.printf("The recommend calories for gaining .5 pounds a week is %d. %n", femaleCalories);
                } else if (userSelection == 2) {
                    femaleCalories = femaleCalories + 500;
                    System.out.printf("The recommend calories for gaining 1 pounds a week is %d. %n", femaleCalories);
                } else {
                    femaleCalories = femaleCalories + 1000;
                    System.out.printf("The recommend calories for gaining 2 pounds a week is %d. %n", femaleCalories);
                }
            }

        }

        System.out.println("Thank you for using Unlimited Fitness!");
        scanner.close();
    }
}