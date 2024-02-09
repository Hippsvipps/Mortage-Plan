package org.example;
import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> lines = CustomFileReader.readLines("prospects.txt");

        // Parse the lines into Prospect objects
        List<Prospect> prospects = LineParser.parseLines(lines);

        // Calculate and set the monthly payments for each prospect
        for (Prospect prospect : prospects) {
            double monthlyPay = MonthlyPaymentCalculator.calculateMonthlyPayment(prospect);
            prospect.setMonthlyPayment(monthlyPay);
        }

        // Print the output
        OutputPrinter.printOutput(prospects);
    }
}