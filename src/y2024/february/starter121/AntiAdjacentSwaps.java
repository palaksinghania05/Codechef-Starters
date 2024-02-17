package y2024.february.starter121;

import java.util.Scanner;

public class AntiAdjacentSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            if (N == 1) {
                System.out.println("YES");
            } else if (N == 2) {
                if (arr[0] > arr[1]) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else if (N == 3) {
                if (arr[1] > Math.max(arr[0], arr[2]) || arr[1] < Math.min(arr[0], arr[2])) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                System.out.println("YES");
            }
            T--;
        }
    }
}
