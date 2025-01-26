package y2025.january.starter170;

import java.util.Scanner;

public class CrazyJumpingFrogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int count = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] % 2 == 0)
                    count++;
            }
            System.out.println(Math.max(count, N - count));
            T--;
        }
    }
}
