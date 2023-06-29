package y2023.june.starter96;

import java.util.Scanner;

public class ABDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.abs((a * b) - (a + b)));
    }
}
