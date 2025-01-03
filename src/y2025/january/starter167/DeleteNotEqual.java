package y2025.january.starter167;

import java.util.Scanner;

public class DeleteNotEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') {
                    count++;
                }
            }
            if (count > 0 && count != N) {
                System.out.println(1);
            } else {
                System.out.println(N);
            }
            T--;
        }
    }
}
