package y2025.july.starter195;

import java.util.Scanner;

public class FailingGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] scores = new int[N];
            int sum = 0;
            boolean flag = false;
            for (int i = 0; i < N; i++) {
                scores[i] = sc.nextInt();
                sum += scores[i];
                double avg = (double) sum / (i + 1);
                if (avg < 40) {
                    flag = true;
                }
            }
            if (flag)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
