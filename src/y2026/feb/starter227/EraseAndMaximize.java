package y2026.feb.starter227;

import java.util.Scanner;

public class EraseAndMaximize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int T = sc.nextInt();
            while (T-- > 0) {
                long N = sc.nextLong();
                long S = sc.nextLong();
                long temp = Math.max(0L, S - 5 * N);
                long result = 6 * N - temp;
                System.out.println(result);
            }
        }
        sc.close();
    }
}
