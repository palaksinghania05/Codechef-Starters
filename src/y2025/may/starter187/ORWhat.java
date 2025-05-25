package y2025.may.starter187;

import java.util.Scanner;

public class ORWhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int[] P = new int[N + 1];
            boolean[] flag = new boolean[N + 1];
            for (int i = 1; i <= N; i++) {
                if ((i | X) == X) {
                    int temp = X ^ i;
                    if (temp >= 1 && temp <= N && !flag[temp]) {
                        P[i] = temp;
                        flag[temp] = true;
                    }
                }
            }
            int temp = 1;
            for (int i = 1; i <= N; i++) {
                if (P[i] == 0) {
                    while (flag[temp]) temp++;
                    P[i] = temp;
                    flag[temp] = true;
                }
            }
            for (int i = 1; i <= N; i++) {
                System.out.print(P[i] + " ");
            }
            System.out.println();
        }
    }
}
