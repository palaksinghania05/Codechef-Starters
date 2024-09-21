package y2024.september.starter152;

import java.util.Scanner;

public class WinningWorldFinals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int M = sc.nextInt();
            int P = sc.nextInt();
            int submissions = 0;
            while (M < 299 && M + P + 20 * submissions < 1000) {
                M++;
                submissions++;
            }
            if (M + P + 20 * submissions <= 1000)
                System.out.println(submissions);
            else
                System.out.println(submissions - 1);
            T--;
        }
    }
}
