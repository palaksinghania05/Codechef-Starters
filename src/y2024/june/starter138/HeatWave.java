package y2024.june.starter138;

import java.util.Scanner;

public class HeatWave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (Y > X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
