package com.codewithmk;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int someNumber = 9999999;
        byte age = 30;
        long someLongNumber = 31212487812223L;
        float ratio = 3.45F;

        Date now = new Date();

        String hello = new String("Welcome" + " Mk");
        System.out.println(hello.replace("Mk", "\"Mkumar\""));
        System.out.println("C:\n\\Windows\t  \\...");
        System.out.println(hello.endsWith("Mk"));

        System.out.println(hello);
        age = 31;
        System.out.println(age);
        System.out.println(now);

        Point point1 = new Point(1, 2);
        Point point2 = point1;

        point1.x = 11;
        System.out.println(point1);
        System.out.println(point2);

        // Arrays
        int[] numbers = new int[5];
        numbers[4] = 4;
        System.out.println(numbers[4]);
        System.out.println(Arrays.toString(numbers));
        int[] someNumbers = {55, 11, 22, 33, 44};
        Arrays.sort(someNumbers);
        System.out.println(Arrays.toString(someNumbers));

        // Multi-Dimentional
        int[][] twoDNumbers = new int[2][3];
        twoDNumbers[0][0] = 1;

        int[][] twoDNumbersAgain = {{1, 2, 3}, {4, 5}};

        System.out.println(Arrays.deepToString(twoDNumbers));
        System.out.println(Arrays.deepToString(twoDNumbersAgain));

        // Constants
        final float PI = 3.14F;

        // Arithmetic
        double result = (double) 10 / (double) 3;
        System.out.println(result);

        int counter = 1;
        counter += 2;
        System.out.println(counter);

        String aNumber = "123";
        System.out.println(Integer.parseInt(aNumber) + 5);
        System.out.println(Double.parseDouble("3.5") + 5);

        // Math class
        System.out.println(Math.round(1.3F));
        System.out.println(Math.round(2.2D));
        System.out.println((int) Math.ceil(1.4F));
        System.out.println(Math.max(1, 5));
        System.out.println(Math.round(Math.random() * 100));

        // Formatting numbers (10%)
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();

        System.out.println(currency.format(1234567.87));
        System.out.println(percent.format(1.1));

        NumberFormat.getPercentInstance().format(0.7);

        // read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("You are " + name.trim());

        // Mortgage Calculator
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        System.out.println("Enter the amount you need: ");
        int amountNeeded = scanner.nextInt();
        System.out.println("Annual Interest Rate: ");
        float interest = scanner.nextFloat();
        float monthlyInterest = interest / PERCENT / MONTHS_IN_YEAR;
        System.out.println("Period(In Years): ");
        byte years = scanner.nextByte();
        int numberOfMonths = years * MONTHS_IN_YEAR;

        double mortgage = amountNeeded
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfMonths))
                / (Math.pow(1 + monthlyInterest, numberOfMonths) - 1);

        System.out.println("Your mortgage is: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
