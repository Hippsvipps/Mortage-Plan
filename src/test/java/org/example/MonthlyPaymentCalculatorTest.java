package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonthlyPaymentCalculatorTest {

    @Test
    void testCalculateMonthlyPayment() {
        // Test with basic input values
        Prospect prospect1 = new Prospect("John Doe", 1000, 5.0, 1);
        assertEquals(85.61, MonthlyPaymentCalculator.calculateMonthlyPayment(prospect1), 0.01);

        // Test with edge case of very small loan amount
        Prospect prospect3 = new Prospect("Alice Johnson", 100, 1.0, 2);
        assertEquals(4.21, MonthlyPaymentCalculator.calculateMonthlyPayment(prospect3), 0.01);
    }
}
