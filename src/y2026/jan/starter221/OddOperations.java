package y2026.jan.starter221;

import java.util.ArrayList;
import java.util.Scanner;

public class OddOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextInt();
            int result = 0;
            if (N % 2 == 1) {
                System.out.println(result);
            } else if (N < 10 && N % 2 == 0) {
                System.out.println(-1);
            } else {
                ArrayList<Long> digit = new ArrayList<>();
                while (N > 0) {
                    digit.add(N % 10);
                    N /= 10;
                }
                long temp = 0;
                for (Long i : digit) {
                    if (i % 2 == 1) {
                        result = 1;
                        break;
                    } else {
                        temp = Math.max(temp, i);
                    }
                }
                if (result == 0) {
                    if (temp == digit.get(0)) {
                        result = 3;
                    } else {
                        result = 2;
                    }
                }
                System.out.println(result);
            }
        }
    }
}
