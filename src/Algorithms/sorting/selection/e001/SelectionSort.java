package Algorithms.sorting.selection.e001;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class SelectionSort {

    public static void doSort(List<Integer> items) {
        Instant start = Instant.now();
        Integer[] array = items.toArray(new Integer[0]);
        items.clear();

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < array.length - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            items.add(array[i]);

        }
        System.out.println("Sorted array : " + items);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
        System.out.println("Time Elapsed in MS : " + timeElapsed);
    }
}
