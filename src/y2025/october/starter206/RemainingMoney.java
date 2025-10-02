package y2025.october.starter206;

import java.util.Scanner;

public class RemainingMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = N - (A * B);
        System.out.println(result);
    }
}
