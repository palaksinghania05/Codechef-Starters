package y2025.august.starter201;

import java.util.Scanner;

public class MixingLiquids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int units = Math.min(A, B / 2);
            int result = units * 3;
            System.out.println(result);
        }
    }
}
