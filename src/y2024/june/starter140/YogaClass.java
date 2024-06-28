package y2024.june.starter140;

import java.util.Scanner;

public class YogaClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int temp1 = N / 2;
            int temp2 = N % 2;
            int max1 = temp1 * Y + temp2 * X;
            int max2 = N * X;
            int maxAmount = Math.max(max1, max2);
            System.out.println(maxAmount);
            T--;
        }
    }
}
