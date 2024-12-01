package y2024.november.started162;

import java.util.Scanner;

public class PermutationModK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] result = new int[N];
            for (int i = 0; i < N; i++) {
                result[i] = i + 1;
            }
            boolean flag = false;
            for (int j = 0; j < N; j++) {
                flag = true;
                for (int i = 0; i < N; i++) {
                    if (result[(i + j) % N] % K == (i + 1) % K) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    for (int i = 0; i < N; i++) {
                        System.out.print(result[(i + j) % N] + " ");
                    }
                    System.out.println();
                    break;
                }
            }
            if (!flag) {
                System.out.println(-1);
            }
            T--;
        }
    }
}
