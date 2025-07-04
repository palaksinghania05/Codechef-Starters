package y2025.july.starter193;

import java.util.Scanner;

public class CountOddEvenDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int even = 0, odd = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    if (i % 2 == 0) {
                        even++;
                    } else {
                        odd++;
                    }
                }
            }
            System.out.println(odd + " " + even);
            T--;
        }
    }
}
