//package org.example;
//
//import org.junit.jupiter.api.Test;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//import java.util.ArrayList;
//import java.util.List;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//public class OutputPrinterTest {
//
//    @Test
//    public void testPrintOutput() {
//        // Arrange: Create a list of Prospect objects with known values
//        List<Prospect> prospects = new ArrayList<>();
//        prospects.add(new Prospect("John Doe", 2000.0, 5.0, 3));
//        prospects.add(new Prospect("Jane Smith", 3000.0, 6.0, 5));
//
//        // Calculate and set the monthly payment for each Prospect
//        for (Prospect prospect : prospects) {
//            double monthlyPayment = MonthlyPaymentCalculator.calculateMonthlyPayment(prospect);
//            prospect.setMonthlyPayment(monthlyPayment);
//        }
//
//        // Redirect System.out to capture printed output
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outputStream));
//
//        // Act: Call the printOutput method
//        OutputPrinter.printOutput(prospects);
//
//        // Retrieve the printed output
//        String printedOutput = outputStream.toString();
//
//        // Assert: Compare the printed output against the expected output
//        String expectedOutput = "Customer: John Doe\n" +
//                "Wants to borrow: 2000.0 €\n" +
//                "For a period of: 3 years\n" +
//                "and pays each month : 59[,.]94 €\n\n" +  // Regular expression for comma or period
//                "Customer: Jane Smith\n" +
//                "Wants to borrow: 3000.0 €\n" +
//                "For a period of: 5 years\n" +
//                "and pays each month : 58[,.]00 €\n\n";  // Regular expression for comma or period
//        assertTrue(printedOutput.matches(expectedOutput));
//    }
//}
