package y2024.march.starter126;

import java.util.Scanner;

public class PermutationDisturbance {
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
            for (int i = 0; i < N - 1; i++) {
                if (arr[i] != i + 1) {
                    continue;
                } else {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    result++;
                }
            }
            if (arr[N - 1] == N)
                result++;
            System.out.println(result);
            T--;
        }
    }
}
