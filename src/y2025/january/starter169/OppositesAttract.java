package y2025.january.starter169;

import java.util.Scanner;

public class OppositesAttract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            StringBuilder result = new StringBuilder(" ");
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == '1') {
                    result.append('0');
                } else {
                    result.append('1');
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
