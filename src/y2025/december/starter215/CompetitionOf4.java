package y2025.december.starter215;

import java.util.Scanner;

public class CompetitionOf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int prize = 1000 * (int) Math.pow(2, 4 - X);
        System.out.println(prize);
    }
}
