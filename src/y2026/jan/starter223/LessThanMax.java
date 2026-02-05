package y2026.jan.starter223;

import java.util.Scanner;

public class LessThanMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int temp = 2;
            int result = 0;
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                if (a == 1 || a < temp) {
                    result++;
                } else if (a == temp && result > 0) {
                    result++;
                    temp++;
                }
            }
            System.out.println(result);
        }
    }
}
