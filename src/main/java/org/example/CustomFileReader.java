package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class CustomFileReader {
    // Private constructor to prevent instantiation
    CustomFileReader(File filename) {
        throw new AssertionError(); // Throw an error if someone tries to instantiate this class
    }
    public static List<String> readLines(String filename) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader inputFile = new BufferedReader(new FileReader(filename))) {
            // Skip the first line (header)
            inputFile.readLine();

            String line;
            while ((line = inputFile.readLine()) != null) {
                // Check if the line is empty or contains only whitespace
                if (!line.trim().isEmpty()) {
                    // Special handling for the last line
                    if (line.trim().equals(".")) {
                        break; // Exit the loop if the last line is encountered
                    }
                    // Check if the line contains a double quote
                    if (line.contains("\"")) {
                        // Remove double quotes
                        line = line.replace("\"", "");
                    }

                    // Check if the line contains four commas
                    if (line.chars().filter(ch -> ch == ',').count() == 4) {
                        // Replace the first comma with a space
                        line = line.replaceFirst(",", " ");
                    }

                    lines.add(line);
                }
            }
            return lines;
        }}}
