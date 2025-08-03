package y2025.july.starter197;

import java.util.Scanner;

public class GoodRankingPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(2);
        for (int i = 1; i <= N; i++)
            System.out.print(i + " ");
        System.out.println();
        for (int i = N; i >= 1; i--)
            System.out.print(i + " ");
        System.out.println();
    }
}
