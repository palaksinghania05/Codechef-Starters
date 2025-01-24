package y2025.january.starter170;

import java.util.Scanner;

public class MinimumBottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int sum = 0;
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            if (sum % X == 0) {
                System.out.println(sum / X);
            } else {
                System.out.println((sum / X) + 1);
            }
            T--;
        }
    }
}
