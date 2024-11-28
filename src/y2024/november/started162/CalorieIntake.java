package y2024.november.started162;

import java.util.Scanner;

public class CalorieIntake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int temp = Y * Z;
        if (X < temp) {
            System.out.println(-1);
        } else {
            System.out.println(X - temp);
        }
    }
}
