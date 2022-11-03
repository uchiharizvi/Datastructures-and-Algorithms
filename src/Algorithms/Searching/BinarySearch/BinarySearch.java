package Algorithms.Searching.BinarySearch;

public class BinarySearch {

    //Recursive Implementation
    public int doBinarySearch(int arr[], int l, int r, int x) {
        if (r >= 1) {
            int mid = l + (r - 1) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] > x) return doBinarySearch(arr, l, mid - 1, x);
            return doBinarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
