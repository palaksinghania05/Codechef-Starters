package y2024.december.starter163;

import java.util.Scanner;

public class NiceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int sum = 0;
            int count = 0;
            for (int i = 0; i < N; i++) {
                int element = sc.nextInt();
                sum += (int) Math.floor(1.0 * element / K);
                if (element % K != 0) {
                    count++;
                }
            }
            if (sum > 0 || sum < -count) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
            T--;
        }
    }
}
