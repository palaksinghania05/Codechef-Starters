package y2025.october.starter206;

import java.util.Scanner;

public class GladiatorFighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int min = N - 2;
            int max = (N - 1) * (N - 2) / 2;
            System.out.println(min + " " + max);
        }
    }
}
