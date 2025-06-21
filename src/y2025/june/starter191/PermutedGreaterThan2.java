package y2025.june.starter191;

import java.util.Scanner;

public class PermutedGreaterThan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if (Y == 0) {
                if (X <= Z + 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                if (Z >= X) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}
