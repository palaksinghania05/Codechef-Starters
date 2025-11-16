package y2025.november.starter212;

import java.util.Scanner;

public class BinaryFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int temp1 = 0, temp2 = 0;
            char[] ch = S.toCharArray();
            for (int i = 1; i < N; i++) {
                if (ch[i] == ch[i - 1]) {
                    if (ch[i] == '0')
                        temp2++;
                    else
                        temp1++;
                }
            }
            if (temp1 >= temp2) {
                System.out.println(0);
                continue;
            }
            int sum = temp1 + temp2;
            int n1 = (int) Math.ceil((double) sum / 2);
            int n2 = Math.abs(sum - n1);
            int val = Math.max(n1, n2);
            int result = val - temp1;
            System.out.println(result);
        }
    }
}
