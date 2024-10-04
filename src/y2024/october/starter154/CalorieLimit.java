package y2024.october.starter154;

import java.util.Scanner;

public class CalorieLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            int result = 0;
            for (int j = 0; j < N; j++) {
                if (count + arr[j] <= K) {
                    count += arr[j];
                    result++;
                } else {
                    break;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
