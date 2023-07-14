package y2023.july.starter98;

import java.util.Scanner;

public class FindAAndB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            if (((X * Y) % Z) == 0) {
                int A = X * Y;
                int B = Z;
                System.out.println(A + " " + B);
            } else if (((Y * Z) % X) == 0) {
                int A = Y * Z;
                int B = X;
                System.out.println(A + " " + B);
            } else if (((Z * X) % Y) == 0) {
                int A = Z * X;
                int B = Y;
                System.out.println(A + " " + B);
            } else {
                System.out.println(-1);
            }
            T--;
        }
    }
}
