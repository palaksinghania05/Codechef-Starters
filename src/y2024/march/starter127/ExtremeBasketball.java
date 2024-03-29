package y2024.march.starter127;

import java.util.Scanner;

public class ExtremeBasketball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int temp = B - A + 10;
            if (A - B >= 10) {
                System.out.println(0);
            } else {
                if (temp % 3 == 0) {
                    System.out.println(temp / 3);
                } else {
                    System.out.println((temp / 3) + 1);
                }
            }
            T--;
        }
    }
}
