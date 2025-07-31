package y2025.july.starter197;

import java.util.Scanner;

public class IndependenceDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X > 15) {
            System.out.println(-1);
        } else {
            System.out.println(15 - X);
        }
    }
}
