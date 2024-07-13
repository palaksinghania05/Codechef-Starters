package y2024.july.starter142;

import java.util.Scanner;

public class ChefLovesPizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextInt();
            long power = 1;
            while (power <= n) {
                power <<= 1;
            }
            power >>= 1;
            //long h = Math.pow(2,power);
            int ans = 0;
            for (long i = power; i < n; i = i + 2) {
                ans += 4;
            }
            System.out.println(ans);
        }
    }
}
