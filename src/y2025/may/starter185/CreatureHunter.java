package y2025.may.starter185;

import java.util.Scanner;

public class CreatureHunter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int H = sc.nextInt();
            int[] S = new int[N];
            int[] D = new int[N];
            int temp1 = 0;
            int temp2 = 0;
            for (int i = 0; i < N; i++) {
                S[i] = sc.nextInt();
                D[i] = sc.nextInt();
                if (S[i] == 1)
                    temp1 = Math.max(temp1, D[i]);
                else
                    temp2 = Math.max(temp2, D[i]);
            }
            int result = Integer.MAX_VALUE;
            if (temp1 > 0) {
                result = Math.min(result, (int) Math.ceil(H / (temp1 * 1.0)));
            }
            if (temp2 > 0) {
                result = Math.min(result, 2 * (int) Math.ceil(H / (temp2 * 1.0)));
            }
            if (temp2 > 0 && H - temp2 * (H / temp2) > 0 && (temp2 * (H / temp2)) + temp1 >= H) {
                result = Math.min(result, 2 * (H / temp2) + 1);
            }
            System.out.println(result);
        }
    }
}
