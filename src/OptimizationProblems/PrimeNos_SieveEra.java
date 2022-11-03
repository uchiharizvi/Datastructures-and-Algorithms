package OptimizationProblems;

public class PrimeNos_SieveEra {
    public static void main(String[] args) {
        int n = 30;
        System.out.print(
                "Following are the prime numbers ");
        System.out.println("smaller than or equal to " + n);
        sieveOfEratosthenes(n);
    }

    private static void sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n+1];
        
    }

}
