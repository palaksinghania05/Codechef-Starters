package y2024.may.starter132;

import java.util.Arrays;
import java.util.Scanner;

public class Game11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] arr1 = new int[N];
            int[] arr2 = new int[M];
            for (int i = 0; i < N; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < M; i++) {
                arr2[i] = sc.nextInt();
            }
            if (N < 4 || M < 4 || M + N < 11) {
                System.out.println("-1");
            } else {
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                long sum = 0;
                for (int i = N - 1; i > N - 5; i--) {
                    sum += arr1[i];
                }
                for (int j = M - 1; j > M - 5; j--) {
                    sum += arr2[j];
                }
                int count = 3;
                int i = N - 5, j = M - 5;
                while (i >= 0 && j >= 0 && count > 0) {
                    if (arr1[i] < arr2[j]) {
                        sum += arr2[j];
                        j--;
                    } else {
                        sum += arr1[i];
                        i--;
                    }
                    count--;
                }
                while (i >= 0 && count > 0) {
                    sum += arr1[i];
                    i--;
                    count--;
                }
                while (j >= 0 && count > 0) {
                    sum += arr2[j];
                    j--;
                    count--;
                }
                System.out.println(sum);
            }
            T--;
        }
    }
}
