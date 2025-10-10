package y2025.october.starter207;

import java.util.Scanner;

public class Tourist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            sc.nextLine();
            int result = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                sc.nextLine();
                result = Math.min(result, Math.abs(A - x) + Math.abs(B - y));
            }
            System.out.println(result);
        }
    }
}
