package com.codewithmk;

import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};

        // usual for loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("With for loop " + fruits[i]);
        }

        // for each
        for (String fruit : fruits) {
            System.out.println("The fruit is " + fruit);
        }

        int j = 1;
        do {
            System.out.println("I am do while with " + j);
            j--;
        } while (j == 0);

        int k = 0;
        while (k < 5) {
            System.out.println("I am while with " + k);
            k++;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("I am " + i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("It's a Fiver and Threer");
        } else if(number % 5 == 0) {
            System.out.println("It's a Fiver");
        } else if(number % 3 == 0) {
            System.out.println("It's a Threer");
        }

        String role = "Admins";
        switch (role) {
            case "Admin":
                System.out.println(role);
                break;
            default:
                System.out.println("Some role");
        }

        List<String> list;
        List<Map<String, String>> list1;
        String[] favs = {"iPhone", "Airpods"};

        Map<String, String> mapBooks = new HashMap<>();
        mapBooks.put("attr1", "Value1");

        System.out.println(Arrays.toString(favs));
        System.out.println(mapBooks);
    }
}
