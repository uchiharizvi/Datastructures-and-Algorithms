package DataStructures.Arrays.Problem;


public class SortArrayEfficient {
    /**
     * Sort an array which contain 1 to n values
     **/
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 2, 8, 3, 5, 4, 6, 1};
        int n = arr.length;
        arraySort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     **/

    private static void arraySort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
    }
    /**Native approach :
     Sort this array with the use of any type of sorting method. it takes O(nlogn) minimum time.
     Efficient approach :
     Replace every element with it’s position. it takes O(n) efficient time and give you the sorted array. Let’s understand this approach with the code below. **/
}
