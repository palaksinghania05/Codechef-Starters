package y2026.feb.starter225;

import java.util.Scanner;

public class AllEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < N; i++) {
                sum += sc.nextInt();
            }
            if (sum % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
