package y2023.september.starter101;

import java.util.Scanner;

public class WorkSmarterNotHarder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int res1 = (int) Math.ceil((double) A / B);
            int res2 = (int) Math.ceil((double) A / C);
            if (res1 == res2) {
                System.out.println(-1);
            } else {
                System.out.println(res1 - res2 - 1);
            }
            T--;
        }
    }
}
