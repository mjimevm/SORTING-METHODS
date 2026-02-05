package org.sorting;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class to manage file operations related to sorting algorithms.
 * Purpose: To read integers from a file and return them as a list.
 */

public class FileManager {
    
    /**
     * Reads integers from a specified file and returns them as a list.
     * @param filename Name of the file to read the integers from
     * @return ArrayList of integers read from the file
     */
    
    public static Integer[] readNumbersFromFile(String filename) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                try {
                    // Parse the line as an integer and add to the list
                    int number = Integer.parseInt(line.trim());
                    numbersList.add(number);
                } catch (NumberFormatException e) {
                    System.out.println("Número inválido en el archivo: " + line);
                }
            }
            reader.close(); // Close the file reader
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        
        // Convert ArrayList to Integer array and return
        return numbersList.toArray(new Integer[0]);
    }
    /**
     * Create a copy of an array of integers.
     * @param original Original array to copy
     * @return Copy of the array
     */
    public static Integer[] copyArray(Integer[] original) {
        // Create a new array of the same size
        Integer[] copy = new Integer[original.length];
        
        // Copy each element from the original array to the new array
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        
        return copy;
    }
}
