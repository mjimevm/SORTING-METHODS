package org.sorting;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Main class to execute the random number generation and display the generated numbers.
 * Purpose: To interact with the user, generate random numbers, and read them from the file for display.
 */

public class Main {
    public static void main(String[] args) {
        RandomNumbersGenerator rng = new RandomNumbersGenerator();
        System.out.println("== GENERADOR DE NÚMEROS ALEATORIOS ==");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a generar: ");
        int size = teclado.nextInt();
        rng.generateNumbers(size, "random_numbers.txt");
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Leer los números generados
        System.out.println("\nNúmeros generados:");
        try (Scanner fileScanner = new Scanner(new java.io.File("random_numbers.txt"))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
                numbersList.add(Integer.parseInt(line)); // Agregar el número a la lista
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
        // Ordenar los numeros utilizando diferentes algoritmos de ordenamiento
        Sorter<Integer> sorter = new Sorter<>(numbersList.toArray(new Integer[0]));
        sorter.setInput(numbersList.toArray(new Integer[0])); // Convertir la lista a un array y establecerlo como entrada para el sorter
        Integer[] gnomeSorted = sorter.gnomeSort(); // Ordenar usando Gnome Sort
        System.out.println("\nNúmeros ordenados con Gnome Sort:");
        for (Integer num : gnomeSorted) {
            System.out.println(num);
        }
        sorter.setInput(numbersList.toArray(new Integer[0])); // Restablecer la entrada para el sorter
        Integer[] mergeSorted = sorter.mergeSort(); // Ordenar usando Merge Sort
        System.out.println("\nNúmeros ordenados con Merge Sort:");
        for (Integer num : mergeSorted) {
            System.out.println(num);
        }
        sorter.setInput(numbersList.toArray(new Integer[0]));
        Integer[] quickSorted = sorter.quickSort(); // Ordenar usando Quick Sort
        System.out.println("\nNúmeros ordenados con Quick Sort:");
        for (Integer num : quickSorted) {
            System.out.println(num);
        }
    }
}