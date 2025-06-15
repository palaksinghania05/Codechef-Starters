package y2025.june.starter190;

import java.util.Scanner;

public class LightAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();
            char[] charArray = S.toCharArray();
            for (int i = 0; i < N - 1; i++) {
                if ((charArray[i] == '1' && charArray[i + 1] == '0') || (charArray[i] == '0' && charArray[i + 1] == '1')) {
                    charArray[i] = '7';
                    charArray[i + 1] = '7';
                }
            }
            boolean flag = true;
            for (char ch : charArray) {
                if (ch == '0') {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "Yes" : "No");
        }
    }
}
