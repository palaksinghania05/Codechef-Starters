package y2024.january.starter118;

import java.util.Scanner;

public class LiteracyRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int P = sc.nextInt();
            int L = sc.nextInt();
            double temp = ((double) L / P) * 100;
            if (temp >= 75) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
