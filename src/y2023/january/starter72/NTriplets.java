/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 04-01-2023
 */

package y2023.january.starter72;

import java.util.Scanner;

public class NTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int x = isPrime(N);
            if (x == -1)
                System.out.println(-1);
            else
                System.out.println(x + " " + N / x + " " + 1);
            T--;
        }
    }

    public static int isPrime(int n) {
        if (n <= 1)
            return -1;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
                return i;
        }
        return -1;
    }
}
