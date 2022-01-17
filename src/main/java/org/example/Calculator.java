package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.lang.String.*;
import static java.lang.String.valueOf;

public class Calculator {
    public int add(String s, String s1) {
        int sum = 0;
        ArrayList<String> array = new ArrayList<String>();
        array.add(s);
        array.add(s1);

        for (var element : array) {
            if (element.equals("")) {
                return 0;
            }
            else if (element.contains(",")) {
                var numbers = element.split(",");
                for (var number : numbers) {
                    sum += Double.parseDouble(number);
                }
            }
            else {
                sum += Double.parseDouble(element);
            }
        }
        return (int) sum;
    }
}