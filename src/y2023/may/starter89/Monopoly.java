package y2023.may.starter89;

import java.util.Scanner;

public class Monopoly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            if (P > Q + R + S || Q > P + R + S || R > P + Q + S || S > P + Q + R)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
