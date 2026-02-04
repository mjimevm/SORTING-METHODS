package org.sorting;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RandomNumbersGenerator rng = new RandomNumbersGenerator();
        System.out.println("== GENERADOR DE NÚMEROS ALEATORIOS ==");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a generar: ");
        int size = teclado.nextInt();
        ArrayList<Integer> randomNumbers = rng.generateRandomNumbers(size);
        System.out.println("Números generados: " + randomNumbers);
    }
}