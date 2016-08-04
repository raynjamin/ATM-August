package com.theironyard.charlotte;

import java.util.Scanner;

public class Main {
    private static ATM atm = new ATM();

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

	    System.out.println("Welcome!");
        System.out.println("What is your name?");

        String name = scanner.nextLine();

        if (name.equals("")) {
            throw new Exception("You gotta be called somethin buddy");
        }

        atm.setUser(new Person(name, 75.00));

        System.out.println("Welcome, " + name);

        System.out.println("What would you like to do today?");
        System.out.println("Your options:");
        System.out.println("1. Check my Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Cancel");

        int selection = Integer.valueOf(scanner.nextLine());

        if (selection == 1) {
            atm.checkBalance();
        } else if (selection == 2) {
            System.out.println("How much money would you like to withdraw?");
            int amount = Integer.valueOf(scanner.nextLine());

            atm.withdrawFunds(amount);

        } else if (selection == 3) {
            atm.endSession();
        }
    }
}
