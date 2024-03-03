package y2024.february.starter123;

import java.util.Scanner;

public class MinimumAndMaximum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextLong();
        while (T > 0) {
            long N = sc.nextLong();
            long temp = N / 2;
            if (N % 2 == 0) {
                System.out.println(temp * (temp + 1));
            } else {
                System.out.println(temp * (temp + 1) + (temp + 1));
            }
            T--;
        }
    }
}
