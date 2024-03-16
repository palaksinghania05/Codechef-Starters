package y2024.march.starter125;

import java.util.Scanner;

public class FakeCertificate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int ones = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') {
                    ones++;
                }
            }
            int max = 0;
            int zeroes = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '0') {
                    zeroes++;
                } else {
                    max = Math.max(max, zeroes);
                    zeroes = 0;
                }
            }
            max = Math.max(max, zeroes);
            System.out.println(ones + max);
            T--;
        }
    }
}
