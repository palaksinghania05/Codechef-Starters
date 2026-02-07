package y2026.feb.starter224;

import java.util.Scanner;

public class AABBCCDD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next().toLowerCase();
            int[] freq = new int[26];
            for (char c : S.toCharArray()) {
                freq[c - 'a']++;
            }
            int max1 = 0, max2 = 0;
            for (int f : freq) {
                if (f > max1) {
                    max2 = max1;
                    max1 = f;
                } else if (f > max2) {
                    max2 = f;
                }
            }
            System.out.println(max1 + max2);
        }
        sc.close();
    }
}
