package Algorithms.sorting.bubble.standard.impl.examples.e001;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class BubbleSort {

    public static void doBubbleSort(List<Integer> items) {
        Instant start = Instant.now();
        Integer[] itemArray = items.toArray(new Integer[0]);
        items.clear();

        for (int i = 0; i < itemArray.length - 1; i++)
            for (int j = 0; j < itemArray.length - i - 1; j++)
                if (itemArray[j] > itemArray[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    Integer temp = itemArray[j];
                    itemArray[j] = itemArray[j + 1];
                    itemArray[j + 1] = temp;
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
