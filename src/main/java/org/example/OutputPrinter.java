package org.example;
import java.util.List;
public class OutputPrinter {
    public static void printOutput(List<Prospect> prospects) {
        for (Prospect prospect : prospects) {
            // Use the extracted values for calculations or other purposes
            System.out.println("Customer: " + prospect.getCustomerName());
            System.out.println("Wants to borrow: " + prospect.getTotalLoan() + " €");
            System.out.println("For a period of: " + prospect.getYears() + " years");
            System.out.println("and pays each month : " + String.format("%.2f", prospect.getMonthlyPayment()) + " €");

            System.out.println(); // Add a blank line for separation
        }
    }
}