package y2024.may.starter134;

import java.util.Scanner;

public class Origin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            long N = sc.nextLong();
            long temp = N / 9;
            long quotient = N - temp * 9;
            long remainder = temp * 45;
            long result = remainder + quotient * (quotient + 1) / 2;
            System.out.println(result);
            T--;
        }
    }
}
