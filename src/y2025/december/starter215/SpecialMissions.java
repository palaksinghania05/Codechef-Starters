package y2025.december.starter215;

import java.util.Scanner;

public class SpecialMissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int C = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            String S = sc.next();
            int normalSum = 0, specialSum = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '0') {
                    normalSum += A[i];
                } else {
                    specialSum += A[i];
                }
            }
            int result = normalSum;
            if (normalSum >= C && specialSum > C) {
                result = normalSum + specialSum - C;
            }
            System.out.println(result);
        }
    }
}
