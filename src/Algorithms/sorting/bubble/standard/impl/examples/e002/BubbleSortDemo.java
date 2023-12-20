package Algorithms.sorting.bubble.standard.impl.examples.e002;


import java.util.Scanner;

public class BubbleSortDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Size Of Array ");
        int n = scanner.nextInt();
        Integer[] collection = new Integer[n];
        System.out.println("Enter the Elements :");
        for (int i = 0; i < n; i++) {
            collection[i] = scanner.nextInt();
        }
        System.out.println("The Array of ELements :");
        print(n, collection);

        doBubbleSort(collection);

        System.out.println("After Sorting :");
        print(n,collection);

    }

    private static void doBubbleSort(Integer[] collection) {
        int n = collection.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (collection[j] > collection[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = collection[j];
                    collection[j] = collection[j+1];
                    collection[j+1] = temp;
                }
    }

    private static void print(int n, Integer[] collection) {
        for (int i = 0; i < n; i++) {
            System.out.println(collection[i]);
        }
    }
}
