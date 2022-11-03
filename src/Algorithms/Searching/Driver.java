package Algorithms.Searching;

import Algorithms.Searching.BinarySearch.BinarySearch;
import Algorithms.Searching.JumpSearch.JumpSearch;
import Algorithms.Searching.LinearSearch.LinearSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        LinearSearch lSearch = new LinearSearch();
        BinarySearch bSearch = new BinarySearch();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter list of elements to be included in the list| Range 1-100 : ");
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                34, 55, 89, 144, 233, 377, 610};
        int x = 55;
        List<Integer> list = new ArrayList<>();
        for (int element : arr) list.add(element);
        System.out.println("Given Array : " + list);
        //To be searched
        System.out.println("Value to search is : " + x);
        System.out.println("Pick the Algorith to proceed with : ");
        System.out.println("1) Linear Search -- TC : O(n)");
        System.out.println("2) Binary Search");
        System.out.println("3) Jump Search -- TC : O(√n)");

        int choice = scan.nextInt();
        switch (choice) {
            case 1: {
                int result = lSearch.doLinearSearch(arr, x);
                if (result == -1) System.out.println("Element is not present");
                else System.out.println("Linear Search : Element present at index : " + result);
                break;
            }
            case 2: {
                int result = bSearch.doBinarySearch(arr, 0, arr.length - 1, x);
                if (result == -1) System.out.println("Element is not present");
                else System.out.println("Linear Search : Element present at index : " + result);
                break;
            }
            case 3: {
                JumpSearch jSearch = new JumpSearch();
                int index = jSearch.jumpSearch(arr, x);
                if (index == -1) System.out.println("Element is not present");
                else System.out.println("Linear Search : Element present at index : " + index);
                break;
            }

        }

    }
}
