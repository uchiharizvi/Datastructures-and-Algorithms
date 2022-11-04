package Algorithms.Sorting.BubbleSort.Implementations.B;


import Algorithms.Sorting.PrintArray;

public class Demo {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bs.sort(arr);
        System.out.println("Bubble Sorted :");
        PrintArray.print(arr);
    }
}
