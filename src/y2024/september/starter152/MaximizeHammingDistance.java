package y2024.september.starter152;

import java.util.Scanner;

public class MaximizeHammingDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String[] S = new String[M];
            for (int i = 0; i < M; i++) {
                S[i] = sc.next();
            }
            long result = 0;
            for (int i = 0; i < N; i++) {
                long count0 = 0, count1 = 0, count2 = 0;
                for (int j = 0; j < M; j++) {
                    char c = S[j].charAt(i);
                    if (c == '0')
                        count0++;
                    else if (c == '1')
                        count1++;
                    else
                        count2++;
                }
                long temp = 0;
                if (count2 == 0)
                    temp = count0 * count1;
                else {
                    for (int k = 0; k <= count2; k++) {
                        long temp1 = count2 - k;
                        temp = Math.max(temp, (count1 + (long) k) * (count0 + temp1));
                    }
                }
                result += temp;
            }
            System.out.println(result);
            T--;
        }
    }
}
