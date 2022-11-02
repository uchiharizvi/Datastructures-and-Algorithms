package Algorithms.Searching.InsertionSort;


import java.util.Arrays;

public class InsertionSortDemo {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        InsertionSort sortingAlgorithm = new InsertionSort();
        sortingAlgorithm.sort(arr);
        print(arr);
    }
    static void print(int[] arr){
        Arrays.stream(arr).asLongStream().forEach(System.out::println);
    }
}
