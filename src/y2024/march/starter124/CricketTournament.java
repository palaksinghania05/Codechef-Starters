package y2024.march.starter124;

import java.util.Scanner;

public class CricketTournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (N <= M) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
            T--;
        }
    }
}
