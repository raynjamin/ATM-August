package com.theironyard.charlotte;

/**
 * Created by Ben on 8/4/16.
 */
public class ATM {
    private Person user;

    public Person getUser() {
        return user;
    }

    public void setUser(Person user) {
        this.user = user;
    }

    public void checkBalance() {
        System.out.printf("You currently have $%.2f dollars.\n", user.getAccountBalance());
    }

    public void endSession() {
        System.out.println("Thank you and please come again.");
    }

    public void withdrawFunds(int amount) throws Exception {
        // if the user has enough money
        // and the amount is a multiple of 5
        // print "please take your cash" and the amount,
        // and the amount the user has left.

        if (amount < 0) {
            throw new Exception("Please enter an amount that's greater than 0");
        }

        if (amount > user.getAccountBalance()) {
            throw new Exception("User does not have enough money for specified transaction");
        }

        if (amount % 5 != 0) {
            throw new Exception("The amount withdrawn must be a multiple of 5.");
        }



        user.setAccountBalance(user.getAccountBalance() - amount);

        System.out.printf("Thank you, please take your $%d. You have $%.2f remaining.\n", amount, user.getAccountBalance());
    }
}
