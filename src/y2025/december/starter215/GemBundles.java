package y2025.december.starter215;

import java.util.Scanner;

public class GemBundles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int R = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int temp = 0;
            if (R > 0 && B > 0 && C > 0) {
                temp = Math.min(R, Math.min(B, C));
            }
            int result = temp * 10;
            R = R - temp;
            B = B - temp;
            C = C - temp;
            result += (R * 3) + (B * 3) + (C * 3);
            System.out.println(result);
        }
    }
}
