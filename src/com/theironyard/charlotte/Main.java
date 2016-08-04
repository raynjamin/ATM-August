package com.theironyard.charlotte;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

	    System.out.println("Welcome!");
        System.out.println("What is your name?");

        String name = scanner.nextLine();

        if (name.equals("")) {
            throw new Exception("You gotta be called somethin buddy");
        }

        System.out.println("Welcome, " + name);

        System.out.println("What would you like to do today?");
        System.out.println("Your options:");
        System.out.println("1. Check my Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Cancel");

        int selection = Integer.valueOf(scanner.nextLine());

        if (selection == 1) {
            System.out.println("Your balance is $100.");
        } else if (selection == 2) {
            System.out.println("How much money would you like to withdraw?");

            int amount = Integer.valueOf(scanner.nextLine());

            if (amount > 100) {
                throw new Exception("You don't have enough money son.");
            }

            System.out.printf("Here is your $%d. You have $%d remaining in your account.\n", amount, 100 - amount);
        } else if (selection == 3) {
            System.out.println("Thank you and please come again.");
        }
    }
}
