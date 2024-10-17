package y2024.october.starter156;

import java.util.Scanner;

public class LongQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int temp = arr[N - 1];
            int result = N;
            for (int i = N - 2; i >= 0; i--) {
                if (arr[i] <= temp / 2) {
                    result--;
                } else {
                    break;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
