package y2025.december.starter216;

import java.util.Scanner;

public class Scoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int bob = (Y - X) / 2;
            int alice = bob + X;
            System.out.println(alice + " " + bob);
            T--;
        }
    }
}
