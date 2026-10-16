package com.pluralsigth;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String name= propmtForName(scanner);
       double hours= promptForHours(scanner);
       double payRate = promptForPayRate(scanner);

       double grossPay = calculateGrossPay(hours, payRate);

       displayResult(name, grossPay);
    }

    public static String propmtForName(Scanner scanner){
        System.out.print("Enter employee name: ");
        return scanner.nextLine();
    }

    public static double promptForHours(Scanner scanner){
        System.out.print("Enter hours worked: ");
        return scanner.nextDouble();
    }

    public static double promptForPayRate(Scanner scanner){
        System.out.print("Enter pay rate: ");
        return scanner.nextDouble();
    }

    public static double calculateGrossPay(double hours, double payRate){
        if(hours > 40){
            double regularPay = 40 * payRate;
            double overtimeHours = hours - 40;
            double overtimePay = overtimeHours * (payRate * 1.5);
            return regularPay + overtimePay;
        } else {
            return hours * payRate;
        }
    }

    public static void displayResult(String name, double grossPay){
        System.out.printf("Employee: %s%n", name);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);
    }
}
