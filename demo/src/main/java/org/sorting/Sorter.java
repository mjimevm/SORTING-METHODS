package org.sorting;

public class Sorter<T extends Comparable<T>> {
    private T[] input;
    
    public Sorter(T[] input) {
        this.input = input;
    }

    public T[] getInput() {
        return input;
    }

    public void setInput(T[] input) {
        this.input = input;
    }
    
    /**
     * Gnome Sort algorithm
     * Time Complexity: O(n^2) average and worst case, O(n) best case
     */
    public T[] gnomeSort() {
        int index = 0;
        while (index < input.length) {
            if (index == 0 || input[index].compareTo(input[index - 1]) >= 0) {
                index++;
            } else {
                T temp = input[index];
                input[index] = input[index - 1];
                input[index - 1] = temp;
                index--;
            }
        }
        return input;
    }

    /**
     * Merge Sort algorithm
     * Time Complexity: O(n log n) for all cases
     */
    public T[] mergeSort() {
        if (input.length > 1) {
            mergeSortHelper(input, 0, input.length - 1);
        }
        return input;
    }
    
    private void mergeSortHelper(T[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortHelper(arr, left, mid);
            mergeSortHelper(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    
    private void merge(T[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        T[] L = (T[]) new Comparable[n1];
        T[] R = (T[]) new Comparable[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;
        
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    /**
     * Quick Sort algorithm
     * Time Complexity: O(n log n) average case, O(n^2) worst case, O(n log n) best case
     */
    public T[] quickSort() {
        quickSortHelper(input, 0, input.length - 1);
        return input;
    }
    
    private void quickSortHelper(T[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSortHelper(arr, low, pi - 1);
            quickSortHelper(arr, pi + 1, high);
        }
    }
    
    private int partition(T[] arr, int low, int high) {
        T pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        T temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    
    /**
     * Radix Sort algorithm - only works with Integer arrays
     * Time Complexity: O(d * (n + k)) where d is number of digits, k is range of input
     * For practical purposes with integers: O(n)
     */
    public T[] radixSort() {
        if (input.length == 0 || !(input[0] instanceof Integer)) {
            return input;
        }
        
        Integer[] intArray = (Integer[]) input;
        
        // Find the maximum number to know the number of digits
        int max = Math.abs(intArray[0]);
        for (int i = 1; i < intArray.length; i++) {
            if (Math.abs(intArray[i]) > max) {
                max = Math.abs(intArray[i]);
            }
        }
        
        // Do counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(intArray, exp);
        }
        
        input = (T[]) intArray;
        return input;
    }
    
    private void countingSortByDigit(Integer[] arr, int exp) {
        int n = arr.length;
        Integer[] output = new Integer[n];
        int[] count = new int[19]; // -9 to 9 (shifted by 9)
        
        // Store count of occurrences
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit + 9]++;
        }
        
        // Change count[i] so that it contains actual position
        for (int i = 1; i < 19; i++) {
            count[i] += count[i - 1];
        }
        
        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit + 9] - 1] = arr[i];
            count[digit + 9]--;
        }
        
        // Copy the output array to arr[]
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    
    /**
     * Heap Sort algorithm
     * Time Complexity: O(n log n) for all cases
     */
    public T[] heapSort() {
        int n = input.length;
        
        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(input, n, i);
        }
        
        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            T temp = input[0];
            input[0] = input[i];
            input[i] = temp;
            
            // Call heapify on the reduced heap
            heapify(input, i, 0);
        }
        
        return input;
    }
    
    private void heapify(T[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if (left < n && arr[left].compareTo(arr[largest]) > 0) {
            largest = left;
        }
        
        if (right < n && arr[right].compareTo(arr[largest]) > 0) {
            largest = right;
        }
        
        if (largest != i) {
            T swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            
            heapify(arr, n, largest);
        }
    }
}