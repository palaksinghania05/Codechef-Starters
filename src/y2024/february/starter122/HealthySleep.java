package y2024.february.starter122;

import java.util.Scanner;

public class HealthySleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 8)
            System.out.println("LESS");
        if (N == 8)
            System.out.println("PERFECT");
        if (N > 8)
            System.out.println("MORE");
    }
}
