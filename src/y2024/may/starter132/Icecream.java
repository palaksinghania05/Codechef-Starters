package y2024.may.starter132;

import java.util.Scanner;

public class Icecream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println((X * 2 <= Y) ? "YES" : "NO");
    }
}
