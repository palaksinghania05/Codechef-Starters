package y2024.march.starter125;

import java.util.Scanner;

public class BinaryMinimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String S = sc.next();
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') {
                    count++;
                }
            }
            if (count > K) {
                StringBuilder tempStr = new StringBuilder(S);
                for (int i = 0; i < N && K > 0; i++) {
                    if (S.charAt(i) == '1') {
                        tempStr.setCharAt(i, '0');
                        K--;
                    }
                }
                System.out.println(tempStr.toString());
            } else {
                System.out.println("0".repeat(N - K));
            }
            T--;
        }
    }
}
