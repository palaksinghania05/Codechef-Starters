package y2024.february.starter120;

import java.util.Scanner;

public class LargestK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (X > Y + 1 || Y == 0) {
                System.out.println("0");
                T--;
                continue;
            } else if (X == 2) {
                System.out.println(Y);
                T--;
                continue;
            } else {
                int result = Y / (X - 1);
                System.out.println(result);
            }
            T--;
        }
    }
}
