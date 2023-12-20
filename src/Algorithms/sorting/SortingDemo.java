package Algorithms.sorting;

import Algorithms.sorting.bubble.standard.impl.examples.e001.BubbleSort;
import Algorithms.sorting.insertion.e001.InsertionSort;
import Algorithms.sorting.selection.e001.SelectionSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SortingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Enter the size of array : ");
        Integer size = scanner.nextInt();
        List<Integer> items = new ArrayList<>();
        System.out.println("Enter the Contents of the array between 1 to 100");
        for (int i = 0; i < size; i++) {
            //items.add(scanner.nextInt());
            items.add(randomNumber());
        }
        System.out.println("The Items to be sorted : " + items);
        System.out.println("Choose Sorting Algorithm to use : ");
        System.out.println("1) Bubble Sort");
        System.out.println("2) Insertion Sort");
        System.out.println("3) Selection Sort");
        Integer choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Doing the Bubble Sort now....");
                bubbleSort.doBubbleSort(items);
            case 2:
                System.out.println("Doing the Insertion Sort....");
                InsertionSort insertionSort = new InsertionSort();
                insertionSort.doInsertionSort(items);
            case 3:
                System.out.println("Doing the Selection Sort....");
                SelectionSort selectionSort = new SelectionSort();
                selectionSort.doSort(items);
        }

    }

    private static Integer randomNumber() {
        Random random = new Random();
        int randomInteger = random.nextInt();
        return randomInteger;
    }

}

