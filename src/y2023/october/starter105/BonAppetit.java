package y2023.october.starter105;

import java.util.Scanner;

public class BonAppetit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println(N * X + M * Y);
    }
}
