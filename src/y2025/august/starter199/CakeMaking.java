package y2025.august.starter199;

import java.util.Scanner;

public class CakeMaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int total = A * B;
        int small = Math.min(A, B);
        int result = total - small;
        System.out.println(result);
    }
}
