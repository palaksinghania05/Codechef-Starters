package y2025.august.starter201;

import java.util.Scanner;

public class MarkPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            boolean possible = true;
            int i = 0;
            while (i < N) {
                if (S.charAt(i) == '1') {
                    int j = i;
                    while (j < N && S.charAt(j) == '1') {
                        j++;
                    }
                    int length = j - i;
                    if (length == 1 || length == 2) {
                        possible = false;
                        break;
                    }
                    i = j;
                } else {
                    i++;
                }
            }
            System.out.println(possible ? "Yes" : "No");
        }
    }
}
