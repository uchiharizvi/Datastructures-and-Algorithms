package Algorithms.sorting.insertion.e001;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class InsertionSort {

    public static void doInsertionSort(List<Integer> items) {
        Instant start = Instant.now();
        Integer[] itemArray = items.toArray(new Integer[0]);
        items.clear();

        for (int i = 1; i < itemArray.length; ++i) {
            int key = itemArray[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && itemArray[j] > key) {
                itemArray[j + 1] = itemArray[j];
                j = j - 1;
            }
            itemArray[j + 1] = key;
        }
        for (int i = 0; i < itemArray.length; i++) {
            items.add(itemArray[i]);

        }
        System.out.println("Sorted array : " + items);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
        System.out.println("Time Elapsed in MS : " + timeElapsed);
    }
}
