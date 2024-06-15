package y2024.june.starter138;

import java.util.Scanner;

public class DistinctSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int temp = K - 1;
            boolean flag = K == 1;
            if (N > K) {
                flag = (K * (K + 1)) / 2 <= N - temp;
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
