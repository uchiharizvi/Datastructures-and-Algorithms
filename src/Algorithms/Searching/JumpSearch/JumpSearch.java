package Algorithms.Searching.JumpSearch;

public class JumpSearch {

    public int jumpSearch(int[] arr, int x) {
        //Finding block size to be jumped
        final double floor = Math.floor(Math.sqrt(arr.length));
        int step = (int) floor;
        //Finding the block where element is present(if it is present)
        int prev = 0;
        while (arr[Math.min(step, arr.length) - 1] < x) {
            prev = step;
            step += (int) floor;
            if (prev >= arr.length) return -1;
        }
        //Linear search for value in block beginning with prev
        while (arr[prev] < x) {
            prev++;
            //if end of block reached or end of array, element not found
            if (prev == Math.min(step, arr.length)) return -1;
        }
        //If element is found
        if (arr[prev] == x) return prev;
        return -1;
    }
}

