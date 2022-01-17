package org.example;

import static java.lang.String.*;
import static java.lang.String.valueOf;

public class Calculator {
    public int add(String s, String s1) {
        if (s.equals("")) {
            return 0;
        }
        if (s1.equals("")) {
            return 0;
        }
        double sum = Double.parseDouble(s1) + Double.parseDouble(s);
        return (int) sum;
    }


}