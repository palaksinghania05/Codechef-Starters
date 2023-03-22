package y2023.march.starter82;

import java.util.Scanner;

public class ReachHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (5 * X >= Y)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
