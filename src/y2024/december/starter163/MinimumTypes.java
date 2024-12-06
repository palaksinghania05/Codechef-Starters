package y2024.december.starter163;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int[] brr = new int[N];
            int K = sc.nextInt();
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                brr[i] = sc.nextInt();
                brr[i] = brr[i] * arr[i];
            }
            Arrays.sort(brr);
            int temp = 0;
            int sum = 0;
            for (int i = N - 1; i >= 0; i--) {
                sum += brr[i];
                temp++;
                if (sum >= K) {
                    break;
                }
            }
            if (temp == N && sum < K)
                System.out.println(-1);
            else
                System.out.println(temp);
            T--;
        }
    }
}
