package y2024.april.starter129;

import java.util.Scanner;

public class BallonDOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int tempCount = 0;
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                if (ele == 2) {
                    tempCount++;
                }
            }
            if (tempCount % 8 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
