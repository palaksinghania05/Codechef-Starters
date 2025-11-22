package y2025.november.starter213;

import java.util.Scanner;

public class No4Please {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int temp1 = 0;
            int temp2 = 0;
            int temp3 = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if (A[i] == 1)
                    temp1++;
                else if (A[i] == 2)
                    temp2++;
                else if (A[i] == 3)
                    temp3++;
            }
            int temp4 = Math.min(temp1, temp3);
            int temp5 = Math.max(0, temp2 - 1);
            int result = temp4 + temp5;
            System.out.println(result);
        }
    }
}
