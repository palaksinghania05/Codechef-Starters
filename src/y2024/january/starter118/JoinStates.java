package y2024.january.starter118;

import java.util.Scanner;

public class JoinStates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (sum + arr[i] >= M) {
                    count = count + 1;
                    sum = 0;
                } else if (sum + arr[i] < M) {
                    sum = sum + arr[i];
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
