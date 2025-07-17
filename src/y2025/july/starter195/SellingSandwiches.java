package y2025.july.starter195;

import java.util.Scanner;

public class SellingSandwiches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int temp = B + C;
        int result = A - (temp);
        System.out.println(result);
    }
}
