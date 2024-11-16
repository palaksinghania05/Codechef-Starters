package y2024.november.starter160;

import java.util.Scanner;

public class EquateSAndT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while (TC > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            String S = sc.next();
            String T = sc.next();
            int i = N - 1, j = M - 1;
            while (i >= 0 && j >= 0) {
                if (S.charAt(i) == T.charAt(j)) {
                    i--;
                    j--;
                } else {
                    if (S.charAt(i) == 'a') {
                        j--;
                    } else {
                        i--;
                    }
                }
            }
            if (i == j) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            TC--;
        }
    }
}
