package y2023.september.starter101;

import java.util.Scanner;

public class OffByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = A + B;
        System.out.println((count) * 10 + 1);
    }
}
