package y2025.april.starter182;

import java.util.Scanner;

public class PalindromicScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0) {
            int X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();
            if (X >= Y && X >= Z) {
                int temp = Z;
                Z = X;
                X = temp;
            }
            if (Y >= X && Y >= Z) {
                int temp = Z;
                Y = temp;
            }
            if (X % 2 == 0 && Y % 2 == 0 || (X % 2 == 0 && Y % 2 == 1) || (X % 2 == 1 && Y % 2 == 0))
                System.out.println(X + Y);
            else
                System.out.println(X + Y - 1);
        }
    }
}
