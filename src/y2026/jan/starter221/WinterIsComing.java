package y2026.jan.starter221;

import java.util.Scanner;

public class WinterIsComing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            boolean flag = false;
            int result = 0;
            for (int i = 0; i < N; i++) {
                int temp = sc.nextInt();
                if (temp < A) {
                    if (!flag) {
                        result++;
                        flag = true;
                    }
                } else if (temp > B) {
                    flag = false;
                }
            }
            System.out.println(result);
        }
    }
}
