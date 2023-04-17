package y2023.april.starter85;

import java.util.Scanner;

public class InsideTheStadium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] score = new int[N];
            for (int i = 0; i < N; i++) {
                score[i] = sc.nextInt();
            }
            int count = 0;
            int run = 0;
            for (int i = 0; i < N; i++) {
                run += score[i];
                //  System.out.println(run);
                double rate = ((double) run / (i + 1)) * 100;
                //   System.out.println(rate);
                if (rate == 100)
                    count++;
            }
            System.out.println(count);
            T--;
        }
    }
}
