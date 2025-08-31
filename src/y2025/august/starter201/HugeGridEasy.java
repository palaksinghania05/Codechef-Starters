package y2025.august.starter201;

import java.util.Scanner;

public class HugeGridEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String A = sc.next();
            long[] B = new long[N];
            B[0] = (A.charAt(0) == '0' ? 0 : 1);
            for (int i = 1; i < N; i++) {
                B[i] = B[i - 1] + (A.charAt(i) == '0' ? 0 : 1);
            }
            long result = 0;
            for (int i = 0; i < N - 1; i++) {
                result += B[i + 1] - B[i] + (A.charAt(i) == '0' ? 0 : 1);
                result += (A.charAt(i) == '0' ? 0 : 1);
            }
            result += (A.charAt(N - 1) == '0' ? 0 : 1);
            System.out.println(result);
        }
    }
}
