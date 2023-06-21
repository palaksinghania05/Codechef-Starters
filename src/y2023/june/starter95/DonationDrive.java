package y2023.june.starter95;

import java.util.Scanner;

public class DonationDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int ans = N - X;
            System.out.println(ans);
            T--;
        }
    }
}
