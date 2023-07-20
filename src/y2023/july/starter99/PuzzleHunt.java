package y2023.july.starter99;

import java.util.Scanner;

public class PuzzleHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X >= 6 && X <= 8) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
