package y2024.december.starter163;

import java.util.Scanner;

public class BinarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            System.out.println(((N + 1) / 2 == K || N / 2 == K) ? "YES" : "NO");
            T--;
        }
    }
}
