package y2025.october.starter210;

import java.util.Scanner;

public class ChocolateEating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A != B) {
                System.out.println(A + B);
            } else {
                System.out.println(A + B - 1);
            }
        }
    }
}
