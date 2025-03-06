package y2025.march.starter176;

import java.util.Scanner;

public class RunForFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        if (X >= Y) {
            System.out.println("0");
        } else if (X == 1) {
            System.out.println(Y - 1);
        } else {
            System.out.println(Y / X);
        }
    }
}
