package y2025.march.starter177;

import java.util.Scanner;

public class TwoBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int K = sc.nextInt();
            int temp = Math.abs(X - Y);
            if (temp == K) {
                System.out.println(0);
                continue;
            }
            if (K > X + Y || temp % 2 != K % 2) {
                System.out.println(-1);
                continue;
            }
            int result = 0;
            if (temp > K) {
                while (temp != K) {
                    temp -= 2;
                    result++;
                }
            } else {
                while (temp != K) {
                    temp += 2;
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
