package y2025.april.starter182;

import java.util.Scanner;

public class BarQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int temp1 = 0, temp2 = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == 'B') {
                    temp2++;
                    if (temp2 > 2 * temp1)
                        break;
                } else
                    temp1++;
            }
            System.out.println(temp1 + temp2);
        }
    }
}
