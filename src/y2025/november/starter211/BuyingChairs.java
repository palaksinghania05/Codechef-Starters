package y2025.november.starter211;

import java.util.Scanner;

public class BuyingChairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int W = sc.nextInt(), P = sc.nextInt(), K = sc.nextInt();
            int result = 0;
            int temp = Math.min(W, K);
            result += temp * 2;
            int temp2 = K - temp;
            if (temp2 > 0) {
                result += temp2;
            }
            System.out.println(result);
        }
        sc.close();
    }
}
