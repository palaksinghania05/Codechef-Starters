package y2024.september.starter151;

import java.util.Scanner;

public class Weightlifting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A1 = sc.nextInt();
        int A2 = sc.nextInt();
        int B1 = sc.nextInt();
        int B2 = sc.nextInt();
        int C1 = sc.nextInt();
        int C2 = sc.nextInt();
        long result = Math.max(A1, A2) + Math.max(B1, B2) + Math.max(C1, C2);
        System.out.println(result);
    }
}
