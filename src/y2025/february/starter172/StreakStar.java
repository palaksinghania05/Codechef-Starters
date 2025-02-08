package y2025.february.starter172;

import java.util.Scanner;

public class StreakStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int result = 1;
            for (int i = 0; i < N; i++) {
                int temp = arr[i];
                arr[i] = arr[i] * X;
                int length = 1;
                for (int j = 0; j < N - 1; j++) {
                    if (arr[j] <= arr[j + 1]) {
                        length++;
                        result = Math.max(result, length);
                    } else {
                        length = 1;
                    }
                }
                arr[i] = temp;
            }
            System.out.println(result);
            T--;
        }
    }
}
