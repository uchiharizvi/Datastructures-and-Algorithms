package Algorithms.Searching.Problems.GoldenRectangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            long L = scanner.nextLong();//Length of Rectangle
            long W = scanner.nextLong();//Width of Rectangle
            count += calculateRatio(L, W);
        }
        System.out.println(count);
    }

    private static int calculateRatio(long l, long w) {
        double result = (double)l / (double)w;
        if (result >= 1.6 && result <= 1.75) return 1;
        else return 0;
    }


    //Ratio = L/W
}
