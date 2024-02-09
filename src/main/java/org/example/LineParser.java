package org.example;

import java.util.ArrayList;
import java.util.List;

public class LineParser {
    public static List<Prospect> parseLines(List<String> lines) {
            List<Prospect> prospects = new ArrayList<>();
            for (String line : lines) {
                String[] values = line.split("(?<!\\s),(?!\\s)");
                if (values.length >= 4) {
                    try {
                        String customerName = values[0];
                        double totalLoan = Double.parseDouble(values[1]);
                        double interest = Double.parseDouble(values[2]);
                        int years = Integer.parseInt(values[3]);
                        prospects.add(new Prospect(customerName, totalLoan, interest, years));
                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing line: " + line);
                    }
                } else {
                    System.err.println("Line does not contain enough values: " + line);
                }
            }
            return prospects;
        }
    }
