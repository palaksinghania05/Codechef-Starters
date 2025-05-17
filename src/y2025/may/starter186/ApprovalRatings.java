package y2025.may.starter186;

import java.util.Arrays;
import java.util.Scanner;

public class ApprovalRatings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int[] A = new int[5];
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                A[i] = sc.nextInt();
                sum += A[i];
            }
            int avg = sum / 5;
            if (avg >= 7) {
                System.out.println(0);
                continue;
            }
            int result = 0;
            Arrays.sort(A);
            for (int i = 0; i < 5; i++) {
                result += 100;
                sum = sum - A[i] + 10;
                avg = sum / 5;
                if (avg >= 7) {
                    System.out.println(result);
                    break;
                }
            }
        }
    }
}
