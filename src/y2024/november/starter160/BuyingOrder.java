package y2024.november.starter160;

import java.util.Scanner;

public class BuyingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            if (arr[0] == 0 && arr[N - 1] == 1)
                System.out.println(2 * (N - 1));
            else
                System.out.println(2 * (N - 1) + 1);
            T--;
        }
    }
}
