package y2024.june.starter137;

import java.util.Scanner;

public class SpellSpice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] V = new int[N];
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                V[i] = sc.nextInt();
                A[i] = sc.nextInt();
            }
            long result = 0;
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    long strength = (long) A[i] * V[j] + (long) V[i] * A[j];
                    result = Math.max(result, strength);
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
