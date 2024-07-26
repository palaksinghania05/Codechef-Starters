package y2024.july.starter144;

import java.util.Scanner;

public class SavingsAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if (X * Y < Z) {
                System.out.println(0);
            } else {
                if ((X * Y - Z) % Y == 0)
                    System.out.println((X * Y - Z) / Y);
                else
                    System.out.println((X * Y - Z) / Y + 1);
            }
            T--;
        }
    }
}
