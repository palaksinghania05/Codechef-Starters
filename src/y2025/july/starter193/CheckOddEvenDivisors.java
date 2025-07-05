package y2025.july.starter193;

import java.util.Scanner;

public class CheckOddEvenDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            System.out.println(A > 0 && B % A == 0 ? "YES" : "NO");
        }
    }
}
