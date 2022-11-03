package Algorithms.Searching.Problems.HexaNumbers;

import java.util.Scanner;

class Test{
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int gcd[] = new int[100000];
        for (int i = 0; i < gcd.length; i++) {
            gcd[i] = GCD(i, hexSum(i));
        }
        while (T-- > 0) {
            int index = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int i = x; i <= y; i++) {
                if (gcd[i] > 1) {
                    index++;
                }
            }
            System.out.println(index);
        }


    }

    static int hexSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum = sum + (x % 16);
            x = x / 16;
        }
        return sum;
    }

    static int GCD(int n1, int n2) {
        int y1 = (n1 > n2) ? n1 : n2;
        int y2 = (n1 < n2) ? n1 : n2;
        if (y2 == 0) {
            return y1;
        }
        return GCD(y2, y1 % y2);


    }
}