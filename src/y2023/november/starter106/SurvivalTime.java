package y2023.november.starter106;

import java.util.Scanner;

public class SurvivalTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int D = sc.nextInt();
            int div = X * 5;
            int days = N / div + D;
            System.out.println(days);
            T--;
        }
    }
}
