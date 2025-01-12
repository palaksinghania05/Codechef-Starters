package y2025.january.starter168;

import java.util.Scanner;

public class BinaryRemovals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int K = sc.nextInt();
            sc.nextLine();
            String S = sc.next();
            long temp = 0, count = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') {
                    count++;
                } else {
                    temp += count;
                }
            }
            if (temp <= X && temp % K == 0) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
            T--;
        }
    }
}
