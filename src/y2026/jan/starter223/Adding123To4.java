package y2026.jan.starter223;

import java.util.Scanner;

public class Adding123To4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int temp1 = Math.min(x, z);
            int temp2 = y / 2;
            int result = temp1 + temp2;
            System.out.println(result);
        }
    }
}
