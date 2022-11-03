package OptimizationProblems;

public class Knapsack_01 {
    public static void main(String[] args) {
        int val[] = new int[]{60, 100, 120};
        int[] wt = new int[]{10, 20, 30};
        int w = 50;
        int n = val.length;
        System.out.println(knapSack_dp(w, wt, val, n));
    }

    /**
     * Recursive BF Approach
     * Time Complexity: O(2n).
     * Auxiliary Space :O(1).
     **/
    private static int knapSack_bf(int w, int[] wt, int[] val, int n) {
        //Base Case
        if (n == 0 || w == 0) return 0;
        if (wt[n - 1] > w) return knapSack_bf(w, wt, val, n - 1);
        else return Math.max(val[n - 1] + knapSack_bf(w - wt[n - 1], wt, val, n - 1), knapSack_bf(w, wt, val, n - 1));
    }

    /**
     * Dynamic Programming Approach
     * Time Complexity: O(N*W).
     * Auxiliary Space: O(N*W).
     **/
    private static int knapSack_dp(int W, int[] wt, int[] val, int n) {
        int i, w;
        int K[][] = new int[n + 1][W + 1];
        //Build Table in Bottoms Up Approach
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0) K[i][w] = 0;
                else if (wt[i - 1] <= w) K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else K[i][w] = K[i - 1][w];
            }
        }
        return K[n][W];
    }
}
