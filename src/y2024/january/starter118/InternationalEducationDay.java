package y2024.january.starter118;

import java.util.Scanner;

public class InternationalEducationDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        System.out.println(Math.max((A * C), (B * C)));
    }
}
