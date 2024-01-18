package y2024.january.starter117;

import java.util.Scanner;

public class YearlyPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        int n = X.length();
        System.out.println("K" + X.charAt(n - 2) + X.charAt(n - 1));
    }
}
