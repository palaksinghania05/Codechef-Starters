package y2025.february.starter173;

import java.util.Scanner;

public class TimePenalty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int totalPenalty = X + (Y * 10);
        System.out.println(totalPenalty);
    }
}
