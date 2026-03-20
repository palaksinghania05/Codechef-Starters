package y2026.march.starter230;

import java.util.Scanner;

public class PassingExams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x > 49 && y > 49) {
                System.out.println("Yes");
            } else if (y > 49 && z > 49) {
                System.out.println("Yes");
            } else if (z > 49 && x > 49) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            T = T - 1;
        }
    }
}
