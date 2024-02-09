package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class LineParserTest {

    @Test
    public void testParseLines() {
        // Create sample lines to parse
        List<String> lines = new ArrayList<>();
        lines.add("Harry,2000,5.0,3");
        lines.add("Percy Jackson,3000,6.0,5");


        // Parse the lines
        List<Prospect> prospects = LineParser.parseLines(lines);

        // Assert that the correct number of prospects were created
        assertEquals(2, prospects.size());

        // Assert that the prospect details were parsed correctly
        Prospect firstProspect = prospects.get(0);
        assertEquals("Harry", firstProspect.getCustomerName());
        assertEquals(2000.0, firstProspect.getTotalLoan());
        assertEquals(5.0, firstProspect.getInterest());
        assertEquals(3, firstProspect.getYears());

        Prospect secondProspect = prospects.get(1);
        assertEquals("Percy Jackson", secondProspect.getCustomerName());
        assertEquals(3000.0, secondProspect.getTotalLoan());
        assertEquals(6.0, secondProspect.getInterest());
        assertEquals(5, secondProspect.getYears());


    }
}
