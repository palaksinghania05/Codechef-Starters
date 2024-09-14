package y2024.september.starter151;

import java.util.Scanner;

public class ConvertString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            int count1 = 0;
            int count2 = 0;
            int result = 0;
            for (int i = 0; i < N; i++) {
                char ch = S.charAt(i);
                if (ch == '0')
                    count1++;
                else
                    count2++;
            }
            for (int k = 1; k <= N; k++) {
                if (k >= count1 && (k - count1) % 2 == 0)
                    result += 1;
                else if (k >= count2 && (k - count2) % 2 == 0)
                    result += 1;
            }
            System.out.println(result);
            T--;
        }
    }
}
