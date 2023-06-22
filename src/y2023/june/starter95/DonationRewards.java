package y2023.june.starter95;

import java.util.Scanner;

public class DonationRewards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            if (X <= 3)
                System.out.println("BRONZE");
            else if (X <= 6)
                System.out.println("SILVER");
            else
                System.out.println("GOLD");
            T--;
        }
    }
}
