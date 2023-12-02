package y2023.november.starter110;

import java.util.Scanner;

public class AmILucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int K = sc.nextInt();
            int Y = N - X;
            int remainingBoys = X % K;
            int remainingGirls = Y % K;

            int result = Math.max(remainingBoys, remainingGirls) - Math.min(remainingBoys, remainingGirls);

            System.out.println(result);
            T--;
        }
    }
}
