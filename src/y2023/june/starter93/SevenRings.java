package y2023.june.starter93;

import java.util.Scanner;

public class SevenRings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int D = N * X;
            int count = 0;
            int aliasD = D;
            while (aliasD % 10 >= 0) {
                count = count + 1;
                aliasD = aliasD / 10;
                if (aliasD == 0) {
                    break;
                }
            }
            if (count == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
