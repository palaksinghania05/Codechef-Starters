package y2024.december.starter164;

import java.util.Scanner;

public class SwapAndFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            String R = sc.next();
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) != R.charAt(i))
                    count++;
            }
            if (count % 2 == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
