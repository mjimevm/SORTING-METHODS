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

        System.out.println("\n¿Qué tipo de datos quieres ordenar?");
        System.out.println("1. Datos aleatorios (desordenados)");
        System.out.println("2. Datos ya ordenados");
        System.out.print("Selecciona una opción (1 o 2): ");
        int opcion = teclado.nextInt();

        rng.generateNumbers(size, "random_numbers.txt");
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Leer los números generados
        System.out.println("\nNúmeros generados:");
        try (Scanner fileScanner = new Scanner(new java.io.File("random_numbers.txt"))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
                numbersList.add(Integer.parseInt(line));
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
            return;
        }

        Integer[] originalData = numbersList.toArray(new Integer[0]);

        // Si eligió opción 2, pre-ordenar los datos
        if (opcion == 2) {
            java.util.Arrays.sort(originalData);
            System.out.println("\n✓ Datos pre-ordenados para prueba");
        }

        System.out.println("\n========================================");
        System.out.println("Ordenando con diferentes algoritmos...");
        System.out.println("========================================\n");

        // GNOME SORT
        Sorter<Integer> sorter = new Sorter<>(FileManager.copyArray(originalData));
        Integer[] gnomeSorted = sorter.gnomeSort();
        System.out.println("\nNúmeros ordenados con Gnome Sort:");
        for (Integer num : gnomeSorted) {
            System.out.println(num);
        }

        // MERGE SORT
        sorter.setInput(FileManager.copyArray(originalData));
        Integer[] mergeSorted = sorter.mergeSort();
        System.out.println("\nNúmeros ordenados con Merge Sort:");
        for (Integer num : mergeSorted) {
            System.out.println(num);
        }

        // QUICK SORT
        sorter.setInput(FileManager.copyArray(originalData));
        Integer[] quickSorted = sorter.quickSort();
        System.out.println("\nNúmeros ordenados con Quick Sort:");
        for (Integer num : quickSorted) {
            System.out.println(num);
        }

        // RADIX SORT
        sorter.setInput(FileManager.copyArray(originalData));
        Integer[] radixSorted = sorter.radixSort();
        System.out.println("\nNúmeros ordenados con Radix Sort:");
        for (Integer num : radixSorted) {
            System.out.println(num);
        }

        // HEAP SORT
        sorter.setInput(FileManager.copyArray(originalData));
        Integer[] heapSorted = sorter.heapSort();
        System.out.println("\nNúmeros ordenados con Heap Sort:");
        for (Integer num : heapSorted) {
            System.out.println(num);
        }

        System.out.println("\n✓ Todos los algoritmos completados");
        teclado.close();
    }
}