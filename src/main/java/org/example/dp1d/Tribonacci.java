package org.example.dp1d;

public class Tribonacci {

    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

    private static int tribonacci(int n) {
        int num1 = 0, num2 = 1, num3 = 1;
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = num1 + num2 + num3;
            num1 = num2;
            num2 = num3;
            num3 = sum;
        }
        return sum;
    }

}
