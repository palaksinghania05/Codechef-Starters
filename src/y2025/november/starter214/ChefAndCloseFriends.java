package y2025.november.starter214;

import java.util.Scanner;

public class ChefAndCloseFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (z <= y)
                System.out.println(2 * z);
            else
                System.out.println(2 * y);
        }
    }
}
