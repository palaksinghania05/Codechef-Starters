package y2025.june.starter191;

import java.util.Scanner;

public class DivideInto3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 3 == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}
