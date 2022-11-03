package EfficiencyTechniques.Simple.UglyNumbers;

public class UglyNumbers {
    public static void main(String[] args) {
        int number = getNthUglyNo(15000000);
        System.out.println("150th Ugly no : " + number);
    }

    private static int getNthUglyNo(int n) {
        int i = 1;
        int count = 1;
        while (n > count) {
            i++;
            if (isUgly(i) == 1) count++;
        }
        return i;
    }

    private static int isUgly(int number) {
        number = maxDivide(number, 2);
        number = maxDivide(number, 3);
        number = maxDivide(number, 5);
        return (number == 1) ? 1 : 0;

    }

    private static int maxDivide(int a, int b) {
        while (a % b == 0) a = a / b;
        return a;
    }
}
