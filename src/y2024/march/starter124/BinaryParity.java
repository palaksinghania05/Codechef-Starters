package y2024.march.starter124;

import java.util.Scanner;

public class BinaryParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextLong();
            long sum = 0;
            while (N > 0) {
                sum += N % 2;
                N /= 2;
            }
            if (sum % 2 == 0) {
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
            T--;
        }
    }
}
