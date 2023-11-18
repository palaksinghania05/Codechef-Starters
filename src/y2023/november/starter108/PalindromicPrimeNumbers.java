package y2023.november.starter108;

import java.util.Scanner;

public class PalindromicPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            if (N <= 4) {
                System.out.println("0 " + N);
            } else {
                System.out.println("1 " + (N - 1));
            }
            T--;
        }
    }
}
