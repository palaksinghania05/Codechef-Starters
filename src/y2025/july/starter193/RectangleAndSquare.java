package y2025.july.starter193;

import java.util.Scanner;

public class RectangleAndSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int R = A * B;
        int S = C * C;
        if (R == S)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
