package y2024.april.starter128;

import java.util.Scanner;

public class BinarySubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            long count1 = 0;
            long count2 = 0;
            long count3 = 0;
            long count4 = 0;
            for (int i = 0; i < N - 1; i = i + 2) {
                if (S.charAt(i) == '0' && S.charAt(i + 1) == '0')
                    count1 += 2;
                if (S.charAt(i) == '1' && S.charAt(i + 1) == '1')
                    count2 += 2;
                else if (S.charAt(i) == '0' && S.charAt(i + 1) == '1')
                    count3++;
                else if (S.charAt(i) == '1' && S.charAt(i + 1) == '0')
                    count4++;
            }
            long result = 0;
            if (count3 > 0)
                result = 2;
            result += count2 + count1;
            if (count4 >= 2) {
                result += 2;
            } else
                result += count4;
            System.out.println(result);
            T--;
        }
    }
}
