package org.sorting;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * Class to generate random numbers for sorting algorithms and save them to files.
 * Purpose: To create a list of random integers with a specified size, ensuring the size does not exceed 3000.
 */

public class RandomNumbersGenerator {

    /**
     * generates a list of random integers and saves them to a file.
     * @param count quantity of random numbers to generate (maximum 3000)
     * @param filename Name of the file where the numbers will be saved
     */
    
    public static void generateNumbers(int count, String filename) {
        // Validate the count parameter
        if (count > 3000) {
            System.out.println("Error: El máximo es 3000 números");
            return;
        }

        try {
            // file writer to save the numbers
            FileWriter writer = new FileWriter(filename);
            Random random = new Random(); // Random number generator
            //Generate count random integers
            for (int i = 0; i < count; i++) {
                int number = random.nextInt(10000); // Generate a random integer
                writer.write(number + "\n"); // Write the number to the file
            }
            writer.close(); // Close the file writer
            System.out.println("Se generaron " + count + " números en " + filename);
        }
        catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}

