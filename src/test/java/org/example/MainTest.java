package org.example;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MainTest {

    @Test
    public void testMainMethod() throws IOException {
        // Mock dependencies
        FileReader fileReaderMock = mock(FileReader.class);
        LineParser lineParserMock = mock(LineParser.class);
        MonthlyPaymentCalculator monthlyPaymentCalculatorMock = mock(MonthlyPaymentCalculator.class);
        OutputPrinter outputPrinterMock = mock(OutputPrinter.class);

        // Create Main instance with mocked dependencies
        Main main = new Main(fileReaderMock, lineParserMock, monthlyPaymentCalculatorMock, outputPrinterMock);

        // Mock data
        List<String> mockLines = new ArrayList<>();
        mockLines.add("John Doe, 2000, 5.0, 3");
        mockLines.add("Jane Smith, 3000, 6.0, 5");

        List<Prospect> mockProspects = new ArrayList<>();
        mockProspects.add(new Prospect("John Doe", 2000, 5.0, 3));
        mockProspects.add(new Prospect("Jane Smith", 3000, 6.0, 5));

        // Configure mock behavior
        when(fileReaderMock.readLines(anyString())).thenReturn(mockLines);
        when(lineParserMock.parseLines(mockLines)).thenReturn(mockProspects);
        when(monthlyPaymentCalculatorMock.calculateMonthlyPayment(any())).thenReturn(250.0);

        // Call the method under test
        main.main(new String[]{});

        // Verify interactions
        verify(fileReaderMock).readLines(anyString());
        verify(lineParserMock).parseLines(mockLines);
        verify(monthlyPaymentCalculatorMock, times(2)).calculateMonthlyPayment(any());
        verify(outputPrinterMock).printOutput(mockProspects);
    }
}