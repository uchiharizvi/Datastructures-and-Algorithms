package Algorithms.PrimeNumbers;

import java.util.Scanner;

public class SieveEratosthenesDemo {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number to find all the prime nos before this : ");
        int n = scan.nextInt();
        System.out.print("Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);

        sieveOfEratosthenes(n);
    }

    private static void sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];

        for (int i = 0; i < n; i++)
            prime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                // Update all multiples of p
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }
}
