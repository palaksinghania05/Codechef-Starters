package y2024.november.started162;

import java.util.Scanner;

public class AssignmentScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int score = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                score += A[i];
            }
            int scoretopass = (N + 1) * 100 / 2;
            int morescoresneeded = scoretopass - score;
            if (morescoresneeded <= 0)
                System.out.println(0); //already pass
            else if (morescoresneeded > 100)
                System.out.println(-1);
            else
                System.out.println(morescoresneeded);
            T--;
        }
    }
}
