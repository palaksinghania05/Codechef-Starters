package y2026.jan.starter219;

import java.util.Scanner;

public class CakeBaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println(Math.min(N, M - N));
    }
}
