package y2024.july.starter142;

import java.util.Scanner;

public class ChefLovesPizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextInt();
            long temp = 1;
            while (temp <= N) {
                temp <<= 1;
            }
            temp >>= 1;
            int result = 0;
            for (long i = temp; i < N; i = i + 2) {
                result += 4;
            }
            System.out.println(result);
            T--;
        }
    }
}
