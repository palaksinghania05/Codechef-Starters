package y2023.september.starter101;

import java.util.Scanner;

public class LockpickingChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String S = sc.next();
            String K = sc.next();
            int minMoves = Integer.MAX_VALUE;
            for (int i = 0; i <= N - M; i++) {
                int moves = 0;
                for (int j = 0; j < M; j++) {
                    int digitS = S.charAt(i + j) - '0';
                    int digitK = K.charAt(j) - '0';
                    moves += Math.min(Math.abs(digitS - digitK), 10 - Math.abs(digitS - digitK));
                }
                minMoves = Math.min(minMoves, moves);
            }
            System.out.println(minMoves);
            T--;
        }
    }
}
