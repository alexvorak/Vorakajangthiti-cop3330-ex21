/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        System.out.print("Please enter the number of the month: ");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int monthnew = Integer.parseInt(month);

        switch (monthnew) {
            case 1:
                System.out.printf("The name of the month is January.");
                break;
            case 2:
                System.out.printf("The name of the month is February.");
                break;
            case 3:
                System.out.printf("The name of the month is March.");
                break;
            case 4:
                System.out.printf("The name of the month is April.");
                break;
            case 5:
                System.out.printf("The name of the month is May.");
                break;
            case 6:
                System.out.printf("The name of the month is June.");
                break;
            case 7:
                System.out.printf("The name of the month is July.");
                break;
            case 8:
                System.out.printf("The name of the month is August.");
                break;
            case 9:
                System.out.printf("The name of the month is September.");
                break;
            case 10:
                System.out.printf("The name of the month is October.");
                break;
            case 11:
                System.out.printf("The name of the month is November.");
                break;
            case 12:
                System.out.printf("The name of the month is December.");
                break;
            default: System.out.printf("Error. Please try again");
            break;

        }
    }
}