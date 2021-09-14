/* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Deirdre Gruman-Walsh
*/

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String args[])
    {
        String CPass  = "abc$123";
        String username;

        System.out.print("Enter your Username : ");
        Scanner user_input = new Scanner(System.in);
        username = user_input.nextLine();

        System.out.print("What is the password ? : ");
        String password = user_input.nextLine();

        if(CPass.equals(password))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }

    }
}
