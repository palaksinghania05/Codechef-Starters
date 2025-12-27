package y2025.december.starter218;

import java.util.Scanner;

public class StopTheCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            String s = sc.next();
            int sum = 0;
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
                if (sum * 2 > i + 1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
