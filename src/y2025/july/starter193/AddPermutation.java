package y2025.july.starter193;

import java.util.Scanner;

public class AddPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int temp = N - K + 1;
            int[] arr = new int[N];
            for (int i = 0; i < temp; i++) {
                arr[i] = temp - i;
            }
            for (int i = temp; i < N; i++) {
                arr[i] = i + 1;
            }
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
