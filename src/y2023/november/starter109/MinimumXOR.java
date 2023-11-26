package y2023.november.starter109;

import java.util.Scanner;

public class MinimumXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int totalXOR = 0;
            for (int num : arr) {
                totalXOR ^= num;
            }
            int minPossibleXOR = totalXOR;
            for (int i = 0; i < N; i++) {
                int xorWithoutElement = totalXOR ^ arr[i];
                if (xorWithoutElement < minPossibleXOR) {
                    minPossibleXOR = xorWithoutElement;
                }
            }
            System.out.println(minPossibleXOR);
            T--;
        }
    }
}
