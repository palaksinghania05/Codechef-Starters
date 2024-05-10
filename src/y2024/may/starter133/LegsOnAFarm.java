package y2024.may.starter133;

import java.util.Scanner;

public class LegsOnAFarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int Q = N / 4;
            int R = (N % 4) / 2;
            System.out.println(Q + R);
            T--;
        }
    }
}
