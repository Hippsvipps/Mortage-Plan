package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProspectTest {

    @Test
    void testGetters() {
        // Create a Prospect object with sample values
        Prospect prospect = new Prospect("Hermonie Granger", 2000.0, 5.0, 3);

        // Test the getters
        assertEquals("Hermonie Granger", prospect.getCustomerName());
        assertEquals(2000.0, prospect.getTotalLoan());
        assertEquals(5.0, prospect.getInterest());
        assertEquals(3, prospect.getYears());
    }

    @Test
    void testSetters() {
        // Create a Prospect object
        Prospect prospect = new Prospect("Hermonie Granger", 2000.0, 5.0, 3);

        // Set the monthly payment
        prospect.setMonthlyPayment(100.0);

        // Test the getter for monthly payment
        assertEquals(100.0, prospect.getMonthlyPayment());
    }
}
