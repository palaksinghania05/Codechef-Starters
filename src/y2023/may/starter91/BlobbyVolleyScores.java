package y2023.may.starter91;

import java.util.Scanner;

public class BlobbyVolleyScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            int a = 0;
            int b = 0;
            if (s.charAt(0) == 'A')
                a++;
            else
                b = 0;
            for (int i = 1; i < N; i++) {
                if (s.charAt(i) == 'A') {
                    if (s.charAt(i - 1) == 'A')
                        a++;
                } else {
                    if (s.charAt(i - 1) == 'B')
                        b++;
                }
            }
            System.out.println(a + " " + b);
            T--;
        }
    }
}
