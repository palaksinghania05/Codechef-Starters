package y2024.july.starter143;

import java.util.Scanner;

public class BinaryConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            String S = sc.next();
            String T1 = sc.next();
            int i = 0, count1 = 0, count2 = 0;
            while (i != N) {
                char char1 = S.charAt(i);
                char char2 = T1.charAt(i);
                if (char1 == '0' && char2 == '1')
                    count1++;
                else if (char1 == '1' && char2 == '0')
                    count2++;
                i++;
            }
            long max1 = S.chars().filter(ch -> ch == '1').count();
            long max2 = S.chars().filter(ch -> ch == '0').count();
            long count = Math.max(max1, max2);
            if (count1 == count2 &&
                    (count1 == K || count > 1 ? (count1 <= K) : S.length() == 2 && S.matches(T1) && (K % 2 == 0))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
