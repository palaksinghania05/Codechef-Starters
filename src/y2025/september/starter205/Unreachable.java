package y2025.september.starter205;

import java.util.Scanner;

public class Unreachable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            boolean odd = false;
            boolean even = false;
            for (int i = 1; i <= N; i++) {
                int ele = sc.nextInt();
                if (ele == 1) {
                    if ((i % 2) == 1)
                        odd = true;
                    else
                        even = true;
                }
            }
            if (odd && even) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
