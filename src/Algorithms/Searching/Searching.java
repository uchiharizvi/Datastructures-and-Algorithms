package Algorithms.Searching;

public class Searching {
    public static void main(String[] args) {
        int arr[] = {2,3,4,10,40};
        int x = 10;
        int result = linearSearch(arr,x);
        System.out.println("Linear Search");
        System.out.println("__________________");
        if(result == -1) System.out.println("Element not Present");
        else System.out.println("Element Present at index " + result);
        System.out.println("Binary Search");
        System.out.println("__________________");
        int result2 = binarySearch(arr,0,arr.length-1,x);
        if(result2 == -1) System.out.println("Element not Present");
        else System.out.println("Element Present at index " + result2);
    }
    /**
     * Best Case : O(1)
     * Worst Case : O(n)
     * Best suited for small arrays**/
    public static int linearSearch(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    /**
     * Best Case : O(1)
     * Worst Case : O(log n)
     * **/
    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= 1) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] > x) return binarySearch(arr, l, mid - 1, x);//recursion
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
