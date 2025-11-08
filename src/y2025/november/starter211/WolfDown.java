package y2025.november.starter211;

import java.util.Scanner;

public class WolfDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int result = S.indexOf("1");
            if (result == -1) {
                System.out.println(N);
            } else {
                System.out.println(result);
            }
        }
    }
}
