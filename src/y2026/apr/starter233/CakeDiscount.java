package y2026.apr.starter233;

import java.util.Scanner;

public class CakeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result;
        if (N >= 5)
            result = N * 85;
        else
            result = N * 100;

        System.out.println(result);
    }
}
