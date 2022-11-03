package DataStructures.Stack.StockSpanProblem;

import java.util.Arrays;

public class StockSpanProblem {
    public static void main(String[] args) {
        int price[] = {10, 4, 5, 90, 120, 80};
        int n = price.length;
        int s[] = new int[n];
        calculateSpan(price, n, s);
        printArray(s);
    }

    private static void printArray(int[] s) {
        System.out.print(Arrays.toString(s));
    }

    /**
     * Time Complexity : O(n^2)
     * **/
    private static void calculateSpan(int[] price, int n, int[] s) {
        //Span Value of First day is always 1
        s[0] = 1;
        for (int i = 1; i < n; i++) {
            s[i] = 1;//span value of remaining days
            for (int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--) s[i]++;
        }
    }
}
