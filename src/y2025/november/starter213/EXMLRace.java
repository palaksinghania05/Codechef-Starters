package y2025.november.starter213;

import java.util.Scanner;

public class EXMLRace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            double temp = -1;
            int result = 1;
            for (int i = 1; i <= N; i++) {
                int d = sc.nextInt();
                int t = sc.nextInt();
                double speed = (double) d / t;
                if (speed > temp) {
                    temp = speed;
                    result = i;
                }
            }
            System.out.println(result);
        }
    }
}
