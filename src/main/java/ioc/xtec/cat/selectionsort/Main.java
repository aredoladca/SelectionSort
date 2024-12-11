package ioc.xtec.cat.selectionsort;

import java.util.Scanner;

/**
 * Classe principal per executar el programa de selecció d'algoritmes.
 * Permet a l'usuari introduir un array, validar-lo, buscar un valor
 * dins l'array i ordenar-lo utilitzant el mètode Selection Sort.
 * 
 * @author Alex Redolad Casas
 * @version 1.0
 */
public class Main {

    /**
     * Mètode principal que gestiona la interacció amb l'usuari
     * i executa el procés de validació, cerca i ordenació de l'array.
     * 
     * @param args Arguments de la línia de comandes (no s'utilitzen).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix la mida de l'array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Introdueix els elements de l'array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        SelectionSort sorter = new SelectionSort();
        ArrayValidator validator = new ArrayValidator();

        try {
            validator.validateArray(array);

            System.out.print("Array original:");
            printArray(array);

            System.out.println("Introdueix un valor a buscar a l'array: ");
            int valueToSearch = scanner.nextInt();

            boolean contains = sorter.contains(array, valueToSearch);
            if (contains) {
                System.out.println("El valor " + valueToSearch + " existeix a l'array.");
            } else {
                System.out.println("El valor " + valueToSearch + " no existeix a l'array.");
            }

            sorter.sort(array);

            System.out.print("Array ordenat:");
            printArray(array);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
    
    /**
     * Mètode que imprimeix els elements de l'array a la consola.
     * 
     * @param arr L'array que es vol imprimir.
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
