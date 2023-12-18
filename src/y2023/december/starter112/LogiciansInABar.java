package y2023.december.starter112;

import java.util.Scanner;

public class LogiciansInABar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String str = sc.next();
            boolean flag = false;
            int i = 0;
            for (; i < N - 1; i++) {
                if (flag)
                    System.out.println("NO");
                else if (str.charAt(i) == '0') {
                    flag = true;
                    System.out.println("NO");
                } else
                    System.out.println("IDK");
            }
            if (str.charAt(i) == '1' && !flag)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
