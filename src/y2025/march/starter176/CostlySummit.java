package y2025.march.starter176;

import java.util.Scanner;

public class CostlySummit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int temp = sc.nextInt();
            String S = sc.next();
            int result = temp * 5;
            for (int i = 0; i < 32; i++) {
                int temp2 = 1;
                int temp3 = 0;
                for (int j = 0; j < 5; j++) {
                    if (((i >> j) & 1) == 1) {
                        temp3 += temp;
                    }
                }
                for (char ch : S.toCharArray()) {
                    if ((1 << (ch - 65) & i) == 0) {
                        temp3 += temp2;
                        temp2++;
                    }
                }
                result = Math.min(result, temp3);
            }
            System.out.println(result);
        }
    }
}
