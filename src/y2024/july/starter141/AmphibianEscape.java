package y2024.july.starter141;

import java.util.Scanner;

public class AmphibianEscape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextLong();
            long K = sc.nextLong();
            long H = sc.nextLong();
            long result = 0;
            long temp = (K + H - 1) / K;
            for (long i = N; i >= temp; i--) {
                if (i >= H) {
                    result += N;
                } else {
                    long b = (i * K - H) / (K - 1);
                    if (b <= 0) break;
                    result += b;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
