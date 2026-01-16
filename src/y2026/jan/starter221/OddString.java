package y2026.jan.starter221;

import java.util.Scanner;

public class OddString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            int[] A = new int[26];
            int temp = Integer.MIN_VALUE;
            for (int i = 0; i < str.length(); i++) {
                int ch = str.charAt(i) - 'a';
                A[ch]++;
                temp = Math.max(temp, A[ch]);
            }
            if (temp >= 3) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
