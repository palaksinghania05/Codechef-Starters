package y2025.june.starter192;

import java.util.Scanner;

public class No3Please {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            int sum = 0;
            int temp = -1;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                sum = (sum + A[i]) % 3;
                if (sum == 0)
                    temp = i;
                B[i] = sum;
            }

            if (temp == -1) {
                System.out.println("Yes");
                continue;
            }

            boolean result = false;
            int[] count = new int[3];
            for (int i = 0; i < N; i++) {
                if (i > temp) {
                    if (count[B[i]] == 0)
                        result = true;
                }
                count[B[i]]++;
            }

            if (result) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
