package y2024.december.starter166;

import java.util.Scanner;

public class MerryChristmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int result = 0;
        X = X - 1;
        if (X >= 0) {
            result++;
        }
        X = X - 2;
        if (X >= 0) {
            result++;
        }
        X = X - 4;
        if (X >= 0) {
            result++;
        }
        System.out.println(result);
    }
}
