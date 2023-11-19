package y2023.november.starter108;

import java.util.Scanner;

public class FairDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String str = sc.next();
            boolean flag = true;
            int count = 0;
            for (int i = N - 1; i >= 0; i--) {
                if (str.charAt(i) == '0') {
                    count++;
                } else {
                    count--;
                }
                if (count < -1 || count > 1) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
