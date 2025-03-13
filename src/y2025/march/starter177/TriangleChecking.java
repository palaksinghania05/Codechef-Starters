package y2025.march.starter177;

import java.util.Scanner;

public class TriangleChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A + B > C) {
            if (B + C > A) {
                if (C + A > B) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
