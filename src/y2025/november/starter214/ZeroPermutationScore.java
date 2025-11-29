package y2025.november.starter214;

import java.util.Scanner;

public class ZeroPermutationScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            if (N <= 2)
                System.out.println(0);
            else
                System.out.println(((N - 2) * (N - 2)) / 4);
        }
    }
}
