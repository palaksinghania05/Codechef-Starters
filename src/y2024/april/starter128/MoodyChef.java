package y2024.april.starter128;

import java.util.Scanner;

public class MoodyChef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int temp = 0;
            int max = 0;
            int min = 0;
            for (int i = 0; i < N; i++) {
                int ele = sc.nextInt();
                if (ele >= l && ele <= r) {
                    temp++;
                } else {
                    temp--;
                }
                max = Math.max(max, temp);
                min = Math.min(min, temp);
            }
            System.out.println(max + " " + min);
            T--;
        }
    }
}
