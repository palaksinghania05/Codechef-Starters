package y2024.may.starter136;

import java.util.Scanner;

public class EvenSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int result = 0;
            for (int i = 0; i < N; i++) {
                int count = 0;
                int sum = 0;
                for (int j = i; j < N; j++) {
                    count++;
                    sum += arr[j];
                }
                if (sum % 2 == 0 && result < count) {
                    result = count;
                }
            }
            for (int j = N - 1; j >= 0; j--) {
                int count = 0;
                int sum = 0;
                for (int k = j; k >= 0; k--) {
                    count++;
                    sum += arr[k];
                }
                if (sum % 2 == 0 && result < count) {
                    result = count;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
