package y2025.june.starter192;

import java.util.Scanner;

public class MissingShoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        System.out.println(Math.abs(L - R));
    }
}
