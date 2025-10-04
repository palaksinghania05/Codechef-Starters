package y2025.october.starter206;

import java.util.Scanner;

public class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int temp1 = 0, temp2 = 0, temp3 = 0;
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                if (A[i] == 1)
                    temp1++;
                else if (A[i] == 2)
                    temp2++;
                else if (A[i] == 3)
                    temp3++;
            }
            int result = (temp1 * (temp1 - 1)) / 2;
            result += temp1 * temp2;
            result += temp2 * temp3;

            System.out.println(result);
        }
        sc.close();
    }
}
