package y2026.jan.starter223;

import java.util.Scanner;

public class SchoolTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int K = sc.nextInt();
            int temp1 = X % K;
            int temp2 = K - (temp1);
            int result = 0;
            if (X % K == 0) {
                result = 0;
            } else if (temp2 <= N - X) {
                result = Math.min(temp1, temp2);
            } else {
                result = temp1;
            }
            System.out.println(result);
        }
    }
}
