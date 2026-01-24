package y2026.jan.starter222;

import java.util.Scanner;

public class CandyTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] A = new int[n + 1];
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                A[ele]++;
            }
            int temp = 0;
            int result = 1;
            for (int c = 1; c <= n; c++) {
                if (A[c] > temp) {
                    temp = A[c];
                    result = c;
                } else if (A[c] == temp && c < result)
                    result = c;
            }
            System.out.println(result);
        }
    }
}
