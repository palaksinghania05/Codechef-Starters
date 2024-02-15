package y2024.february.starter121;

import java.util.Scanner;

public class LegSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println(N < M ? "YES" : "NO");
    }
}
