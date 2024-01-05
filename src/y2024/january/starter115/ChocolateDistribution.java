package y2024.january.starter115;

import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            double N = sc.nextInt();
            double temp = (double) Math.ceil(N / 2);
            System.out.println((int) temp + " " + (int) N);
            T--;
        }
    }
}
