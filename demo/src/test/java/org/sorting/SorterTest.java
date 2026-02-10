package org.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias JUnit para los algoritmos de ordenamiento
 * Hoja de Trabajo #3 - Estructura de Datos
 */
public class SorterTest {

    // ==================== GNOME SORT ====================

    @Test
    @DisplayName("Gnome Sort - Array desordenado")
    public void testGnomeSortUnsorted() {
        Integer[] data = {5, 2, 8, 1, 9, 3, 7};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.gnomeSort();
        Integer[] expected = {1, 2, 3, 5, 7, 8, 9};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Gnome Sort - Array ya ordenado")
    public void testGnomeSortSorted() {
        Integer[] data = {1, 2, 3, 4, 5};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.gnomeSort();
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Gnome Sort - Array con duplicados")
    public void testGnomeSortDuplicates() {
        Integer[] data = {5, 2, 5, 1, 2};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.gnomeSort();
        Integer[] expected = {1, 2, 2, 5, 5};
        assertArrayEquals(expected, result);
    }

    // ==================== MERGE SORT ====================

    @Test
    @DisplayName("Merge Sort - Array desordenado")
    public void testMergeSortUnsorted() {
        Integer[] data = {5, 2, 8, 1, 9, 3, 7};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.mergeSort();
        Integer[] expected = {1, 2, 3, 5, 7, 8, 9};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Merge Sort - Array ya ordenado")
    public void testMergeSortSorted() {
        Integer[] data = {1, 2, 3, 4, 5};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.mergeSort();
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Merge Sort - Array con duplicados")
    public void testMergeSortDuplicates() {
        Integer[] data = {5, 2, 5, 1, 2};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.mergeSort();
        Integer[] expected = {1, 2, 2, 5, 5};
        assertArrayEquals(expected, result);
    }

    // ==================== QUICK SORT ====================

    @Test
    @DisplayName("Quick Sort - Array desordenado")
    public void testQuickSortUnsorted() {
        Integer[] data = {5, 2, 8, 1, 9, 3, 7};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.quickSort();
        Integer[] expected = {1, 2, 3, 5, 7, 8, 9};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Quick Sort - Array ya ordenado")
    public void testQuickSortSorted() {
        Integer[] data = {1, 2, 3, 4, 5};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.quickSort();
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Quick Sort - Array con duplicados")
    public void testQuickSortDuplicates() {
        Integer[] data = {5, 2, 5, 1, 2};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.quickSort();
        Integer[] expected = {1, 2, 2, 5, 5};
        assertArrayEquals(expected, result);
    }

    // ==================== RADIX SORT ====================

    @Test
    @DisplayName("Radix Sort - Array desordenado")
    public void testRadixSortUnsorted() {
        Integer[] data = {5, 2, 8, 1, 9, 3, 7};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.radixSort();
        Integer[] expected = {1, 2, 3, 5, 7, 8, 9};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Radix Sort - Array ya ordenado")
    public void testRadixSortSorted() {
        Integer[] data = {1, 2, 3, 4, 5};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.radixSort();
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Radix Sort - Array con duplicados")
    public void testRadixSortDuplicates() {
        Integer[] data = {5, 2, 5, 1, 2};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.radixSort();
        Integer[] expected = {1, 2, 2, 5, 5};
        assertArrayEquals(expected, result);
    }

    // ==================== HEAP SORT ====================

    @Test
    @DisplayName("Heap Sort - Array desordenado")
    public void testHeapSortUnsorted() {
        Integer[] data = {5, 2, 8, 1, 9, 3, 7};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.heapSort();
        Integer[] expected = {1, 2, 3, 5, 7, 8, 9};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Heap Sort - Array ya ordenado")
    public void testHeapSortSorted() {
        Integer[] data = {1, 2, 3, 4, 5};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.heapSort();
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, result);
    }

    @Test
    @DisplayName("Heap Sort - Array con duplicados")
    public void testHeapSortDuplicates() {
        Integer[] data = {5, 2, 5, 1, 2};
        Sorter<Integer> sorter = new Sorter<>(data);
        Integer[] result = sorter.heapSort();
        Integer[] expected = {1, 2, 2, 5, 5};
        assertArrayEquals(expected, result);
    }
}