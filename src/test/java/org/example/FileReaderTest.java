//package org.example;
//
//import org.example.CustomFileReader;
//import org.junit.jupiter.api.Test;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class FileReaderTest {
//
//    @Test
//    public void testReadFile() {
//        try {
//            // Create a temporary test file with sample input data
//            String filename = "test.txt";
//            File testFilePath = createTestFile(filename);
//
//            // Read the lines from the test file using the static method readLines
//            List<String> lines = CustomFileReader.readLines(String.valueOf(testFilePath));
//
//            // Process the lines to extract Prospect objects
//            List<Prospect> prospects = processLines(lines);
//
//            // Assert that the number of prospects read matches the expected number
//            assert prospects != null;
//            assertEquals(3, prospects.size());
//
//            // Assert the values of the first prospect
//            Prospect firstProspect = prospects.get(0);
//            assertEquals("John Doe", firstProspect.getCustomerName());
//            assertEquals(2000.0, firstProspect.getTotalLoan());
//            assertEquals(3.0, firstProspect.getInterest());
//            assertEquals(5, firstProspect.getYears());
//
//            // Assert the values of the second prospect
//            Prospect secondProspect = prospects.get(1);
//            assertEquals("Jane Smith", secondProspect.getCustomerName());
//            assertEquals(3000.0, secondProspect.getTotalLoan());
//            assertEquals(5.0, secondProspect.getInterest());
//            assertEquals(6, secondProspect.getYears());
//
//            // Assert the values of the third prospect
//            Prospect thirdProspect = prospects.get(2);
//            assertEquals("Alice Johnson", thirdProspect.getCustomerName());
//            assertEquals(1500.0, thirdProspect.getTotalLoan());
//            assertEquals(2.0, thirdProspect.getInterest());
//            assertEquals(4, thirdProspect.getYears());
//
//            // Delete the temporary test file
//            testFilePath.delete();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    private File createTestFile(String filename) throws IOException {
//        File testFile = new File(filename);
//        try (FileWriter writer = new FileWriter(testFile)) {
//            writer.write("John Doe,2000.0,3,5\n");
//            writer.write("Jane Smith,3000.0,5,6\n");
//            writer.write("Alice Johnson,1500.0,2,4\n");
//        }
//        return testFile;
//    }
//
//    private List<Prospect> processLines(List<String> lines) {
//        // Implement logic to convert lines to Prospect objects
//        // This method should parse each line and create Prospect objects accordingly
//        // Return a list of Prospect objects
//        return null; // Placeholder return
//    }
//}
//
