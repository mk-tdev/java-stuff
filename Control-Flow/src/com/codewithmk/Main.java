package com.codewithmk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
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
