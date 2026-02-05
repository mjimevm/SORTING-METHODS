package org.sorting;
import java.util.ArrayList;
import java.util.Random;

public class RandomNumbersGenerator {
    public ArrayList<Integer> generateRandomNumbers(int size) {
        int maxDigits = 4; // 4 digits
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be a positive integer.");
        } else {
            if (size > 3000) {
                size = 3000;
                System.out.println("Size too large, setting to maximum of 3000.");
            }
        }
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            numbers.add(rand.nextInt((int) Math.pow(10, maxDigits)));
            }
        return numbers;
    }
}
