package y2024.may.starter135;

import java.util.Scanner;

public class FootballTies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X == 1 && Y == 1) {
                System.out.println("1");
            } else {
                System.out.println(X % 3);
            }
            T--;
        }
    }
}
