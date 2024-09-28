package y2024.september.starter153;

import java.util.Scanner;

public class AnotherGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            boolean flag = false;
            for (int i = N - 1; i >= 0; i--) {
                if (arr[i] != i + 1) {
                    System.out.println(1 + (i + 1));
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(0);
            }
            T--;
        }
    }
}
