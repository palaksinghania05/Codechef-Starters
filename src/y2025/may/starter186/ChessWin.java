package y2025.may.starter186;

import java.util.Scanner;

public class ChessWin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(Math.max(0, B - A + 1));
    }
}
