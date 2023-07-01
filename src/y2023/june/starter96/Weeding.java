package y2023.june.starter96;

import java.util.Scanner;

public class Weeding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int cal = arr[N - 1] + K;
            if (cal <= M + 1) {
                System.out.println("Yes");
            } else
                System.out.println("No");
            T--;
        }
    }
}
