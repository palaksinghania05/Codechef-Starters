package y2024.february.starter122;

import java.util.Scanner;

public class ProblemReviews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int count = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                if (arr[i] > 4)
                    count++;
            }
            if (count == N)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
