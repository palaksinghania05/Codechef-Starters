package y2026.apr.starter234;

import java.util.Scanner;

public class BakeryProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int A = 100 * N;
        int B = K + 60 * N;
        int result = Math.min(A, B);
        System.out.println(result);
    }
}
