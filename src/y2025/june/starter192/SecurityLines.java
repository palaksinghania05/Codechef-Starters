package y2025.june.starter192;

import java.util.Scanner;

public class SecurityLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
                arr[i] = sc.nextInt();
            int result = arr[0];
            for (int i = 0; i < N; i++) {
                result = Math.min(result, i + Math.max(0, arr[i] - i + 1));
            }
            System.out.println(result);
        }
    }
}
