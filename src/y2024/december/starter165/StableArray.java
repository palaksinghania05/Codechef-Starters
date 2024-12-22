package y2024.december.starter165;

import java.util.Scanner;

public class StableArray {
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
            int temp = 0;
            int ele = arr[N - 1];
            for (int i = N - 2; i >= 0; i--) {
                if (arr[i] < ele) {
                    temp++;
                } else {
                    ele = arr[i];
                    result = Math.max(result, temp);
                    temp = 0;
                }
            }
            result = Math.max(result, temp);
            System.out.println(result);
            T--;
        }
    }
}
