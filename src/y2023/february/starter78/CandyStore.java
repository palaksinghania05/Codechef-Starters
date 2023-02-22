package y2023.february.starter78;

import java.util.Scanner;

public class CandyStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if (Y > X)
                System.out.println(X + (Y - X) * 2);
            else
                System.out.println(Y);
            T--;
        }
    }
}
