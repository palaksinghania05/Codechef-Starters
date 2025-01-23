package y2025.january.starter170;

import java.util.Scanner;

public class AccessCodeEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String temp = "WECNITK";
        if (S.equals(temp)) {
            System.out.print("Welcome to Web Club!");
        } else {
            System.out.print("Access denied");
        }
    }
}
