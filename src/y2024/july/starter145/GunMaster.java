package y2024.july.starter145;

import java.util.Scanner;

public class GunMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int D = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int result = 0;
            boolean temp = true;
            for (int i = 0; i < N; i++) {
                if (A[i] <= D && !temp) {
                    result++;
                    temp = true;
                } else if (A[i] > D && temp) {
                    result++;
                    temp = false;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
