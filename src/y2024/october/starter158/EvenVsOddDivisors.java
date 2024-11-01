package y2024.october.starter158;

import java.util.Scanner;

public class EvenVsOddDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int temp1 = 0, temp2 = 0;
            int N = sc.nextInt();
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    if (i % 2 == 0) {
                        temp1 += 1;
                    } else {
                        temp2 += 1;
                    }
                }
            }
            if (temp1 > temp2) {
                System.out.println(1);
            } else if (temp1 == temp2) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
            T--;
        }
    }
}
