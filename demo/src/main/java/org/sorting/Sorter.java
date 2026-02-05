package org.sorting;
public class Sorter<T extends Comparable<T>> {
    private T[] input;
    public Sorter(T[] input) {
        this.input = input;
    }
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
}