package y2024.march.starter127;

import java.util.Scanner;

public class AntiTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int L = sc.nextInt();
            if (L > 3000) {
                for (int i = 1; i <= N; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            } else {
                int i = 10000;
                int count = 0;
                while (count < N) {
                    System.out.print(i + " ");
                    i += L;
                    count++;
                }
                System.out.println();
            }
            T--;
        }
    }
}
