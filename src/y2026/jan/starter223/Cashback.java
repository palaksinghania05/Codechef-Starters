package y2026.jan.starter223;

import java.util.Scanner;

public class Cashback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X >= 200) {
            System.out.println(X - 50);
        } else {
            System.out.println(X);
        }
    }
}
