package y2025.february.starter172;

import java.util.Scanner;

public class TimeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        System.out.println((X + 25 >= 2050) ? "YES" : "NO");
    }
}
