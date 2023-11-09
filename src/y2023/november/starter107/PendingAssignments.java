package y2023.november.starter107;

import java.util.Scanner;

public class PendingAssignments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if (X * Y <= Z * 24 * 60) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
