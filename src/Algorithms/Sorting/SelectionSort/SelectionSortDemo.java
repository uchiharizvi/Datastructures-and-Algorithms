package Algorithms.Sorting.SelectionSort;

import java.util.Scanner;

public class SelectionSortDemo {

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

        //Integer[] newCollection = new Integer[collection.length];
        doSelectionSort(collection);

        System.out.println("After Sorting ");
        print(n, collection);

      /*  for(Integer collect :collection){
            System.out.println("The Array of ELements : " + collect);
        }*/


    }

    private static void print(int n, Integer[] collection) {
        for (int i = 0; i < n; i++) {
            System.out.println(collection[i]);
        }
    }

    private static void doSelectionSort(Integer[] collection) {

        {
            int n = collection.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i + 1; j < n; j++)
                    if (collection[j] < collection[min_idx])
                        min_idx = j;

                // Swap the found minimum element with the first
                // element
                int temp = collection[min_idx];
                collection[min_idx] = collection[i];
                collection[i] = temp;
            }
        }
    }
}
